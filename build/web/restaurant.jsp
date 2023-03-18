<%-- 
    Document   : restaurant
    Created on : 10 Jun, 2022, 7:23:42 PM
    Author     : Ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="main.restaurant" %>
<!DOCTYPE html>
<%
    String username = (String)session.getAttribute("username");
    restaurant obj = new restaurant();

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
    <script src='https://kit.fontawesome.com/a076d05399.js' ></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" >
<link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
<title>Login</title>
<style>
    #header
    {
        color:orange;
        margin-left: 38%;
    }
</style>
    </head>
    
<body>
    <!--<img src="1.jpg" class="img-responsive" alt="..." style="width: 1000px;height: 672px;position:fixed; margin-top: 0px">-->
       <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header col-md-12 col-sm-12 col-xs-12 col-lg-12">
                <h1 id="header">RESTAURANT</h1>

            </div>

        </div>

    </nav>
    
    <div class="container-fluid" style="margin-top:100px">
        <div class="row">
            <div class="col-md-3 col-lg-3 col-sm-12 col-xs-12">
                
                <div class="form-group">
                    <h2><label for="Username" class="control-label" style="color:blue">Username</label></h2>
                    <input type="text" class="form-control" placeholder="Enter Username" name="username" id="username">
                    
                    
                </div>
                <div class="form-group">
                    <h2><label for="password" class="control-label" style="color:blue">Password</label></h2>
                    <input type="password" class="form-control" placeholder="Enter password" name="password" id="password">
                    
                    
                </div>
                <div class="form-group">
                    <h2><label for="email" class="control-label" style="color:blue">Email</label></h2>
                    <input type="text" class="form-control" placeholder="Enter email" name="email" id="mail">
                    
                    
                </div>
                <div class="form-group">
                    <h2><label for="number" class="control-label" style="color:blue">Number</label></h2>
                    <input type="text" class="form-control" placeholder="Enter number" name="number" id="login_number">
                    
                </div>
                <button id = "submit" class="btn btn-success" style="margin-top:  5px">Submit</button>
                <p id ="demo"></p>
            </div>

        </div>

    </div>
    </body>
    

</html>



<script>
    $(document).ready(function(){
        $("#submit").on("click",function(){
            
            var n = $("#login_number").val();
            var user = $("#username").val();
            var mail = $("#mail").val();
            var password =$("#password").val();
            if(n=="" || user =="" || mail=="" || password=="")
            {
                alert("Please enter the details !!!");
                
            }
             else{
                 
            $.ajax({url:"login_check",data:{number:n,username:user},success:function(result){
                   
                   if(result==="ADMIN")
                   {
                       window.location.href = "Admin.jsp";
                   }
                   else if (result==="CUSTOMER")
                   {
                      $.ajax({url:"create",data:{number:n,username:user},success:function(result){
                              alert(result);
                               window.location.href = "Customer.jsp";
                      }});
                       
                      
                    }
                   else if (result==="COOKING_TEAM")
                   {
                       window.location.href = "Cooking_Team.jsp";
                    }
                   else if (result==="SERVER")
                   {
                       window.location.href = "Server.jsp";
                    }
                    
                    else
                    {
                        
                      alert("new");
                      
                       
                      $.ajax({url:"update",data:{number:n,username:user, pass:password,email:mail},success:function(result){
                        
                              window.location.href = "Customer.jsp";
                      }});
                  
                    }
            }});
    }
        })
        
        
            });
    
</script>

  