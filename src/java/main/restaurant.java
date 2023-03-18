/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.io.FileInputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;
/**
 *
 * @author Ganesh
 */
public class restaurant {
    
    Connection con= null;
    public void connect()
    {
      try{
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/Restaurant","Ganesh","Ganesh@123");
      }   
      catch(Exception e)
      {
          System.out.println(e);
      }
    }
    
    public String login(String number)
    {
        connect();
        String y="";
        try
        {
            PreparedStatement pst = con.prepareStatement("select role from login where number = ?");
            pst.setString(1, number);
            ResultSet rst = pst.executeQuery();
            rst.next();
            y = rst.getString(1);
            System.out.println(y);
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
        
        
        
        return y;
    }
    
    public void insert_image()
    {
     connect();
     try
     {
         PreparedStatement pst = con.prepareStatement("insert into recipe values(1,'Mutton Biriryani', 350, 30, '00:20:00',?)");
         FileInputStream file = new FileInputStream("C:\\Restaurant Images\\Best-Mutton-Biryani-Recipe.jpg");
         pst.setBinaryStream(1, file,file.available());
         pst.executeUpdate();
         con.commit();
         con.close();
         System.out.println("Done");
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }
    public String price_and_tax(String name)
    {
     connect();
     String y ="";
     try
     {
         int a,b;
         PreparedStatement pst = con.prepareStatement("select price,tax from recipes where product_name=?");
         pst.setString(1, name);
         ResultSet rst = pst.executeQuery();
         rst.next();
         a = rst.getInt(1);
         b = rst.getInt(2);
         
         y = Integer.toString(a) +" "+Integer.toString(b);
         System.out.println(y);
     }
     catch(Exception e)
         
     {
         System.out.println(e);   
     }
     
     return y;
        
    }
    
    public void update_total(String seat, String username, int result)
    {
        connect();
        try
        {
            PreparedStatement pst = con.prepareStatement("update seat set total=? where seat_number=? and customer_name=?");
            pst.setInt(1, result);
            pst.setString(2, seat);
            pst.setString(3, username);
            pst.executeUpdate();
            con.commit();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
    }
    public void update_table_login(String username, String item)
    {
        connect();
        try
        {
            PreparedStatement pst = con.prepareStatement("delete from "+ username +" where recipe_name=?");
            pst.setString(1, item);
            pst.executeUpdate();
            con.commit();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
    }
    public int admin_Table(String username,String seat)
    {
     
        connect();
        int y=0;
        try
        {
            PreparedStatement pst = con.prepareStatement("select total from seat where seat_number=? and customer_name=?");
            pst.setString(1, seat);
            pst.setString(2, username);
            ResultSet rst = pst.executeQuery();
            rst.next();
            y = rst.getInt(1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return y;
    }
    public void insert_admin(int total, String username)
    {
     
        connect();
        int y=0;
        try
        {
            PreparedStatement pst = con.prepareStatement("select count(*) from admin");
            ResultSet rst = pst.executeQuery();
            rst.next();
            y = rst.getInt(1)+1;
            PreparedStatement pst1 = con.prepareStatement("insert into admin values(?,?,?,current_date)");
            pst1.setInt(1, y);
            pst1.setString(2, username);
            pst1.setInt(3, total);
            pst1.executeUpdate();
            con.commit();
            con.close();
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public int username(String username)
    {
     
        connect();
        int y=0;
        try
        {
            PreparedStatement pst = con.prepareStatement("select count(*) from login where name=?");
            pst.setString(1, username);
            ResultSet rst = pst.executeQuery();
            rst.next();
            y = rst.getInt(1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return y;
    }
    
    public String fetch_times()
    {
     connect();
     String y="";
     try
     {
         int a=0;
         int b =0;
         PreparedStatement pst = con.prepareStatement("select count(*) from seat where status='WAITING'");
         ResultSet rst = pst.executeQuery();
         rst.next();
         a=rst.getInt(1);
         PreparedStatement pst1 = con.prepareStatement("select count(*) from seat where status='ORDER_READY'");
         ResultSet rst1 = pst1.executeQuery();
         rst1.next();
         b = rst1.getInt(1);
         
         y = Integer.toString(a)+" "+Integer.toString(b);
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     
     return y;
    }
    
    public void update(String number,String email,String username,String password)
    {
     connect();
     int y =0;
     try
     {
         PreparedStatement pst = con.prepareStatement("select count(*) from login");
         ResultSet rst = pst.executeQuery();
         rst.next();
         y = rst.getInt(1) + 1;
         PreparedStatement pst1 = con.prepareStatement("insert into login values (?,?,?,?,?,?)");
         pst1.setInt(1, y);
         pst1.setString(2, username);
         pst1.setString(3, email);
         pst1.setString(4, password);
         pst1.setString(5, number);
         pst1.setString(6, "CUSTOMER");
         pst1.executeUpdate();
         con.commit();
         con.close();
     }
     catch(Exception e)
     {
         System.out.println(e);   
     }
        
    }
    public void create(String username)
            
    {
     
        connect();
        try
        {
            PreparedStatement pst = con.prepareStatement("create table "+ username +" (Id int primary key, Recipe_Name varchar(50) unique not null , Quantity int)");
             pst.executeUpdate();   
             con.commit();;
             con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
    }
    public void insert(String recipe,String username)
    {
     connect();
     int y=0;
     try
     {
        
        PreparedStatement pst1 = con.prepareStatement("select count(*) from "+ username);
        ResultSet rst = pst1.executeQuery();
        rst.next();
        y = rst.getInt(1)+1;
         System.out.println(y);
        PreparedStatement pst2 = con.prepareStatement("insert into "+username+" values(?,?,1)");
        pst2.setInt(1, y);
        pst2.setString(2, recipe);
        
        pst2.executeUpdate();
        con.commit();
        con.close();
     }
     catch(Exception e)
     {
         System.out.println(e);   
     }
        
    }
    
    public void insert_quantity(String name, int number,String username)
    {
        connect();
        try
        {
            PreparedStatement pst = con.prepareStatement("update "+ username +" set quantity=? where recipe_name=?");
            pst.setInt(1, number);
            pst.setString(2, name);
            pst.executeUpdate();
            con.commit();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public ArrayList order_details(String username)
    {
     connect();
     ArrayList<ArrayList> y = new ArrayList();
     try
     {
         PreparedStatement pst = con.prepareStatement("select * from "+username);
         ResultSet rst = pst.executeQuery();
         while(rst.next())
         {
           ArrayList<String> x = new ArrayList();
           x.add(Integer.toString(rst.getInt(1)));
           x.add(rst.getString(2));
           x.add(Integer.toString(rst.getInt(3)));
           y.add(x);
           
         }
     }
     catch(Exception e)
     {
         System.out.println(e);   
     }
     
     return y;
    }
    
    public ArrayList order_details_login(String username)
    {
     connect();
     ArrayList<ArrayList> y = new ArrayList();
     try
     {
         PreparedStatement pst = con.prepareStatement("select Recipe_Name , quantity from "+username);
         ResultSet rst = pst.executeQuery();
         while(rst.next())
         {
           ArrayList<String> x = new ArrayList();
           
           x.add(rst.getString(1));
           x.add(Integer.toString(rst.getInt(2)));
           y.add(x);
           
         }
     }
     catch(Exception e)
     {
         System.out.println(e);   
     }
     
     return y;
    }
    
    public void updatestatus(String seat,String customer,String res,String column)
    {
     connect();
     try
     {
         PreparedStatement pst = con.prepareStatement("update seat set "+ column+"=? where seat_number=? and customer_name=?");
         pst.setString(1, res);
         pst.setString(2, seat);
         pst.setString(3, customer);
         pst.executeUpdate();
         con.commit();
         con.close();
     }
     catch(Exception e )
         
     {
         System.out.println(e);
     }
    }
    
    public void insert_seat(String seat_number,String username,String number,String tablename, int total)
    {
     connect();
     
     try
     {
         String y ="WAITING";
         PreparedStatement pst = con.prepareStatement("insert into seat values(?,?,?,?,?,?)");
         pst.setString(1, seat_number);
         pst.setString(2, username);
         pst.setString(3, number);
         pst.setString(4, tablename);
         pst.setString(5, y);
         pst.setInt(6, total);
         pst.executeUpdate();
         con.commit();;
         con.close();
         
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     
    }
    public int fetch_total(String seat_number,String username)
    {
        connect();
        int y=0;
        
        try
        {
            PreparedStatement pst = con.prepareStatement("select total from seat where seat_number=? and customer_name=?");
            pst.setString(1, seat_number);
            pst.setString(2, username);
            ResultSet rst = pst.executeQuery();
            rst.next();
            y = rst.getInt(1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return y;
    }
    public String fetchstatus(String seat, String username)
    {
        connect();
        String y="";
        try
        {
            PreparedStatement pst = con.prepareStatement("select status from seat where seat_number=? and customer_name=?");
            pst.setString(1, seat);
            pst.setString(2, username);
            ResultSet rst = pst.executeQuery();
            rst.next();
            y = rst.getString(1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return y;
    }
    public ArrayList seat()
    {
      connect();
      ArrayList<String> y = new ArrayList();
      try
      {
          PreparedStatement pst = con.prepareStatement("select seat_number from seat");
          ResultSet rst = pst.executeQuery();
          while(rst.next())
          {
              y.add(rst.getString(1));
          }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      
      return y;
    }
    
    
//    public ArrayList login_status(String username, String number)
//    {
//     connect();
//     ArrayList<String> y = new ArrayList();
//     try
//     {
//         PreparedStatement pst = con.prepareStatement("select status where ")
//     }
//     catch(Exception e)
//     {
//         System.out.println(e);
//     }
//     
//     return y;
//    }
//    public ArrayList fetch(String username)
//     {
//         connect();
//         ArrayList<ArrayList> y = new ArrayList();
//         try
//         {
//             PreparedStatement pst = con.prepareStatement("select * from "+ username);
//             ResultSet rst = pst.executeQuery();
//             while(rst.next())
//             {
//                 ArrayList<String> x = new ArrayList();
//                 x.add(Integer.toString(rst.getInt(1)));
//                 x.add(rst.getString(2));
//                 x.add()
//                 
//             }
//             
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//         return y;
//     
//     }
    
    
    
    public void delete(String username)
    {
     connect();
     try
     {
         PreparedStatement pst = con.prepareStatement("drop table "+ username);
         pst.executeUpdate();
         
         con.commit();
         con.close();
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }
    public void deleteseat(String number,String seat)
    {
        connect();
        try
        {
            PreparedStatement pst1 = con.prepareStatement("delete from seat where seat_number=? and number=?");
            pst1.setString(1, seat);
            pst1.setString(2, number);
            pst1.executeUpdate();
            con.commit();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public ArrayList server_names()
    {
        connect();
        ArrayList<String> y = new ArrayList();
        try
        {
         PreparedStatement   pst = con.prepareStatement("select customer_name from seat");
         ResultSet rst =pst.executeQuery();
         while(rst.next())
         {
//             ArrayList<String> x = new ArrayList();
             y.add(rst.getString(1));
             
         }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return y;
    }
    
    public ArrayList server_number()
    {
        connect();
        ArrayList<String> y = new ArrayList();
        try
        {
         PreparedStatement   pst = con.prepareStatement("select seat_number from seat");
         ResultSet rst =pst.executeQuery();
         while(rst.next())
         {
//             ArrayList<String> x = new ArrayList();
             y.add(rst.getString(1));
             
         }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return y;
    }
    public static void main(String[] args) {
      restaurant obj = new restaurant();
      obj.connect();
      obj.price_and_tax("Mutton Biriyani");
      //obj.create("Mutton Biriyani", "gk");
      
    }
    
}
