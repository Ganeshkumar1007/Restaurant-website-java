<%-- 
    Document   : Admin
    Created on : 11 Jun, 2022, 1:10:00 PM
    Author     : Ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Admin Page</title>
    </head>
   <style>
    #header
    {
        color:orange;
        margin-left: 38%;
    }
</style>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header col-md-12 col-sm-12 col-xs-12 col-lg-12">
                <h1 id="header">RESTAURANT</h1>

            </div>

        </div>

    </nav>
        <div class="container-fluid" style="margin-top:10%">
            <h1>Admin</h1><hr style="color: black">
            <div id ="main">
                <button class="btn btn-danger">Order History</button>
                <button class="btn btn-primary" style="margin-left: 10px" id="edit_orders">Edit Orders</button><br>
            </div>
            
            <div class="col-lg-4 col-md-6 col-sm-12 col-xs-12"style="margin-top: 15px;display: none" id="login">
                <form action="admin_login.jsp">
                    <div class="form-group">
                    <label class="control-label" style="font-size: 30px">Username</label>
                    <input type="text" name="username" class="form-control" placeholder="Enter username">
                    
                </div>
                <div class="form-group">
                    <label class="control-label" style="font-size: 30px" >Number</label>
                    <input type="text" name="number" class="form-control" placeholder="Enter number">
                    
                </div>
                <button id=" submit" class="btn btn-success">Submit</button><br>
                </form>
                
                
            </div>
         
        </div>
    </body>
</html>
<script>
    $(document).ready(function(){
        $("#edit_orders").on("click",function(){
            $("#login").css("display","block");
            $("#main").css("display","none");
            
        })
    })
    
    
</script>