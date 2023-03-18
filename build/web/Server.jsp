<%-- 
    Document   : Server
    Created on : 11 Jun, 2022, 1:10:26 PM
    Author     : Ganesh
--%>

<%@page import="java.sql.*;"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="main.restaurant;"%>
<!DOCTYPE html>

<%
    ArrayList<String> hai = new ArrayList();
    ArrayList<String> bye = new ArrayList();
    restaurant obj = new restaurant();
    hai = obj.server_names();

    String username = (String)session.getAttribute("username");
    String seat = (String)session.getAttribute("seat_number");
    
    String count = obj.fetch_times();
    String[] res = new String[2];
    res = count.split(" ");
    int a = Integer.parseInt(res[0]);
    int b = Integer.parseInt(res[1]);
    System.out.print(a);
    System.out.print(b);
%>



<html>
    <head>
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="style.css">
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
        <title>Server Page</title>
        
        <style>
            #i1,#i2
            {
                font-size: 25px;
            }
            
            
        </style>
    </head>
    <body>
        <h1>Server</h1>
        <div class="container-fluid col-12"> 
        <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
            
            <div class="icon-bar" style="margin-top: 10%">
                <div style="width: 200px;height: 50px;color: red;text-align: center"><a class="active" id="i1" href="#">Orders<span style="margin-left:5px;margin-top: -5px;background-color: red" class="badge badge-danger" id="span-1"><%=a%></span></a></div>
 <br><hr>
                <div style="width: 200px;height: 50px;color: red;text-align: center"><a class="active" id="i2" href="#">Order Ready<span style="margin-left:5px;margin-top: -5px;background-color: red" class="badge badge-danger" id="span-2"><%=b%></span></a></div>
                
              </div>
            
        </div>
        <div class=" container-fluid col-lg-6 col-md-6 col-sm-12 col-xs-12">
            
            <div id="div1"class="row">
                   <%
                Connection con = null;
                 try
                 {
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 con = DriverManager.getConnection("jdbc:derby://localhost:1527/Restaurant","Ganesh","Ganesh@123");
                 PreparedStatement pst = con.prepareStatement("select * from seat ");
                 ResultSet rst = pst.executeQuery();
                 while(rst.next())
                 {
                   if(rst.getString(5).equals("WAITING"))
                   {
                       %>
                 <div style="margin-left: 5px"  >  
                 <h1>Customer Name : <%=rst.getString(2)%></h1>
                 <h2>Seat Number : <%=rst.getString(1)%></h2>
                 <table class="table table-striped">
                     <thead style="background-color: black;color:white">
                         
                         <tr>
                        <th>S.No</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        </tr>
                        
                     </thead>
                     <tbody>
                         <%
                            ArrayList<ArrayList> hai1 = new ArrayList();
                            hai1 = obj.order_details(rst.getString(4));
                            for(ArrayList<String> y : hai1)
                            {%>
                            <tr>
                                <%
                                    for(String x :y)
                                    {%>
                                    <td><%=x%></td>
                                    <%}
                                %>
                            </tr>
                            <%}
                            
                         %>  
                             
                             
                

                            
                     </tbody>
                 </table>
                         <div id="ar" style="align-items:center">
                             
                             <p style="text-align: center"><button style="display: inline;margin-right: 10px"   class="btn btn-success accept ">Accept</button><button class="demo" style="display:none">demo</button><button  style="display: inline; margin-left:  5px" class="btn btn-danger reject">Reject</button></p>
                             
                            
                            
                            
                         </div>
                         <h3 id="status" style="margin-left: 5px"></h3>
                    <hr style="border: 5px violet solid">
                   </div>
                 <%
                   }
                   else{
                       continue;
                   }
                 }
              
            }   
            catch(Exception e)
            {
                System.out.println(e);
            }
        
        
        
        %>
            
            
        </div>
        
        <div id="div2"style="display:none">
            <%
                
                 try
                 {
                 
                 PreparedStatement pst = con.prepareStatement("select * from seat ");
                 ResultSet rst = pst.executeQuery();
                 while(rst.next())
                 {
                   if(rst.getString(5).equals("ORDER_READY") )
                   {
                       %>
                 <div style="margin-left: 5px"  >  
                 <h1>Customer Name : <%=rst.getString(2)%></h1>
                 <h2>Seat Number : <%=rst.getString(1)%></h2>
                 <table class="table table-striped">
                     <thead style="background-color: black;color:white">
                         
                         <tr>
                        <th>S.No</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        </tr>
                        
                     </thead>
                     <tbody>
                         <%
                            ArrayList<ArrayList> hai1 = new ArrayList();
                            hai1 = obj.order_details(rst.getString(4));
                            for(ArrayList<String> y : hai1)
                            {%>
                            <tr>
                                <%
                                    for(String x :y)
                                    {%>
                                    <td><%=x%></td>
                                    <%}
                                %>
                            </tr>
                            <%}
                            
                         %>  
                             
                             
                

                            
                     </tbody>
                 </table>
                         <div id="ar" style="align-items:center">
                             
                             <p style="text-align: center"><button style="display: inline;margin-right: 10px"   class="btn btn-primary deliver ">Order Delivered</button></p>
                             
                            
                            
                            
                         </div>
                         <h3 id="status" style="margin-left: 5px"></h3>
                    <hr style="border: 5px violet solid">
                   </div>
                 <%
                   }
                   else
                   {
                       continue;
                     }
                 }
              
            }   
            catch(Exception e)
            {
                System.out.println(e);
            }
        
        
        
        %>
        </div>
        </div>
        </div> 
    </body>
</html>
<script>
    $(document).ready(function(){
        
        var span2 = $("#span-2").text();
        console.log(span2)
        if(span2=="0")
        {
            $("#span-2").css("display","none");
        }
        
        var span1 = $("#span-1").text();
        console.log(span1)
        if(span1=="0")
        {
            $("#span-1").css("display","none");
        }
        
        
        $("body").on("click",".accept",function(e){
            var a = e.target.parentElement.parentElement.nextElementSibling;
            a.innerHTML="Accepted";
            a.style.color="green";
            var b = e.target.parentElement.parentElement;
            b.style.display="none";
            var col = "status";
            var res = "ACCEPTED";
            var c = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling;
            var d = c.innerHTML;
            var f = d.split(" ");
            
            console.log(f[3]);
            
            var g = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling.previousElementSibling.innerHTML;
            var h = g.split(" ");
            console.log(h[3]);
            
            $.ajax({url:"updatestatus",data:{seat:f[3],customer:h[3],val:res,column:col},success:function(result){
                    alert(result);
            }});
        })
        
        
        $("body").on("click",".reject",function(e){
          var a = e.target.parentElement.parentElement.nextElementSibling;
            a.innerHTML="Rejected";
            a.style.color="red";
            var b = e.target.parentElement.parentElement;
            b.style.display="none";
            var col = "status";
            var res = "REJECTED";
            var c = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling;
            var d = c.innerHTML;
            var f = d.split(" ");
            
            console.log(f[3]);
            
            var g = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling.previousElementSibling.innerHTML;
            var h = g.split(" ");
            console.log(h[3]);
            
            $.ajax({url:"updatestatus",data:{seat:f[3],customer:h[3],val:res,column:col},success:function(result){
                    alert(result);
            }});
        })
        
        
        $("#i2").on("click",function(){
            $("#div2").css("display","block");
            $("#div1").css("display","none");
        })
        
        $("#i1").on("click",function(){
            $("#div2").css("display","none");
            $("#div1").css("display","block");
        })
        
        
        $("body").on("click",".deliver",function(e){
          var a = e.target.parentElement.parentElement.nextElementSibling;
            a.innerHTML="Delivered";
            a.style.color="blue";
            var b = e.target.parentElement.parentElement;
            b.style.display="none";
            var col = "status";
            var res = "DELIVERED";
            var c = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling;
            var d = c.innerHTML;
            var f = d.split(" ");
            
            console.log(f[3]);
            
            var g = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling.previousElementSibling.innerHTML;
            var h = g.split(" ");
            console.log(h[3]);
            
            $.ajax({url:"updatestatus",data:{seat:f[3],customer:h[3],val:res,column:col},success:function(result){
                    alert(result);
            }});
        })
        
        $("body").on("click",".demo",function(e){
            var parent = e.target.parentElement.parentElement.parentElement.parentElement.parentElement.parentElement.children[0];
            parent = parent.children[0].children[0].children[0].children[0];
            var c = parent.innerHTML;
            console.log(c);
            var a = parseInt(c);
            console.log(a);
            a = a-1;
            console.log(a);
            c.innerHTML=a;
            console.log(parent)
        })
    })
    
    
    
</script>
