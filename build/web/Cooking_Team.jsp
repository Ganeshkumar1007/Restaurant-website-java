<%-- 
    Document   : Cooking_Team
    Created on : 11 Jun, 2022, 1:10:57 PM
    Author     : Ganesh
--%>

<%@page import="main.restaurant"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%

    ArrayList<String> hai = new ArrayList();
    ArrayList<String> bye = new ArrayList();
    restaurant obj = new restaurant();
    hai = obj.server_names();

    String username = (String)session.getAttribute("username");
    String seat = (String)session.getAttribute("seat_number");


%>
<!DOCTYPE html>
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
        <title>Cooking_Team Page</title>
    </head>
    <body>
        <h1>Cooking_Team</h1>
        
        
        
        <div class="container-fluid col-lg-6 col-md-6 col-sm-12 col-xs-12">
            <div class="row">
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
                   if(rst.getString(5).equals("ACCEPTED") )
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
                             
                             <p style="text-align: center"><button style="display: inline;margin-right: 10px"   class="btn btn-primary order_ready ">Order Ready</button></p>
                             
                            
                            
                            
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
            
        </div>
    </body>
</html>
<script>
    $(document).ready(function(){
        $("body").on("click",".order_ready",function(e){
            var a = e.target.parentElement.parentElement.nextElementSibling;
            a.innerHTML="Order Ready";
            a.style.color="green";
            var b = e.target.parentElement.parentElement;
            b.style.display="none";
            var col = "status";
            var res = "ORDER_READY";
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
    })
    
    
</script>
