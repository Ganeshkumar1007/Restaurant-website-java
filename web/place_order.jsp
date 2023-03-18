<%-- 
    Document   : place_order
    Created on : 12 Jun, 2022, 12:56:55 PM
    Author     : Ganesh
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="main.restaurant" %>

<!DOCTYPE html>

<%
    String user = (String)session.getAttribute("username");
    String number = (String)session.getAttribute("number");
    String username = user + number;
    restaurant obj = new restaurant();
    ArrayList<ArrayList> hai = new ArrayList();
    hai = obj.order_details(username);
    
    String total = (String)session.getAttribute("total");
    String seat = (String)session.getAttribute("seat_number");
    String a = obj.fetchstatus(seat, user);
    int y1 = obj.fetch_total(seat, user);
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
        <title>Order Details</title>
    </head>
    <body>
        
        <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header col-md-12 col-sm-12 col-xs-12 col-lg-12">
                <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu" id="toggle">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    
                </button>
                    <h1 style="color:orange">Restaurant</h1>
            </div>
            <div class="collapse navbar-collapse" id="menu">
                
                 <!--<form action="delete" class="navbar-right  navbar-btn">-->
                    <button style="margin-left: 10px;margin-top:15px" id="logout" class="btn btn-danger navbar-right  navbar-btn ">Logout</button>
                <!--</form>-->
                
            <ul class="nav navbar-nav navbar-right " style="margin-top:8px">
                <li><a href="#" class="mx-auto" ><i class="fa fa-home"></i> Home</a></li>
                <li><a href="#" class="mx-auto"><i class="fa fa-info"></i>  About</a></li>
                <li><a href="Contact.html" class="mx-auto"><i class="fa fa-phone"></i>  Contact</a></li>
                


            </ul>
               

        </div> 
            </div>
            

        </div>

    </nav>
        <div class="container-fluid" style="margin-top: 8%">
            <h1 style="color:green">Order Placed Successfully!!!</h1>
            <h2>Customer Name :  <%=user%></h2>
            <h3>Total Amount : <%=y1%></h3>
            <h3>Seat Number : <%=seat%></h3>
            <button class="btn btn-primary" id="view_order">View Ordered Items</button><br>
            
            <h1></h1>
            <table class="table table-striped" id="tb" style="display:none">
                <thead style="background-color:black;color: white">
                    <tr>
                        <th>S.No</th>
                        <th>Name</th>
                        <th>Quantity</th>
                    </tr>
                </thead>
                <tbody>
                    
                        <%
                            for(ArrayList<String> x :hai)
                            {%>
                            <tr>
                                <%
                                    for(String y:x)
                                    {%>
                                    <td><%=y%></td>
                                    <%}
                                %>
                            </tr>
                            <%}
                            
                        
                        
                        %>
                    
                </tbody>
            </table>
            <h1></h1>
            <h4 style="display: inline;margin-top: 10px">Order Status : </h4><h5 style="display: inline;margin-top: 5px"><strong><%=a%></strong></h5> 
            <br>
            <br>
            <form action="admin_store">
                <button class="btn btn-primary" id="pay_bill" name="pay">Pay Bill</button>
            </form>
        </div>
    </body>
</html>

<script>
    
    $(document).ready(function(){
       
        $("#view_order").on("click",function(){
         $("#tb").css("display","initial");
        
        });
        
        $("#logout").on("click",function(){
            $.ajax({url:"delete",data:{},success:function(){
                    
            }});
        
            $.ajax({url:"delete_seat",data:{},success:function(result){
                    window.location.href="restaurant.jsp";
            }});
            
        })
    })
    
    
    
    
    
</script>
