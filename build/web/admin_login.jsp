<%-- 
    Document   : admin_login
    Created on : 18 Jun, 2022, 8:11:57 PM
    Author     : Ganesh
--%>
<%@page import="main.restaurant"%>
<%@page import="java.util.ArrayList"%>
<%! String username="";%>
<%
    String user = request.getParameter("username");
    String number = request.getParameter("number");
    username = user + number;

    ArrayList<ArrayList> hai = new ArrayList();
    restaurant obj = new restaurant();
    hai = obj.order_details_login(username);
    

%>

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
        <title>Edit Order</title>
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
        <div class="container-fluid col-lg-6 col-md-6 col-sm-12 col-xs-12" style="margin-top:10%">
            <table class="table table-striped" id="maintable">
                <thead>
                    <tr>
                        
                        <th>Order Item</th>
                        <th>Quantity</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    for(ArrayList<String> y: hai)
                    
                    {%>
                    <tr class="trow">
                        <%
                            for(String x:y)
                            {%>
                                <td><%=x%></td>
                                <%}%><td><button class="btn btn-danger delete">Delete</button></td><%
                        %>
                    </tr>
                   <% }
                    
                    
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
<script>
    
    $(document).ready(function(){
        $("body").on("click",".delete",function(e){
            var i = e.target.parentElement.parentElement.rowIndex;
            document.getElementById("maintable").deleteRow(i);
            var j = document.getElementsByClassName("trow")
            console.log(j.length)
            var quantity_value = e.target.parentElement.previousElementSibling.innerHTML;
            console.log(quantity_value);
            
            var item = e.target.parentElement.previousElementSibling.previousElementSibling.innerHTML;
            console.log(item);
            $.ajax({url:"admin_update",data:{quantity:quantity_value,items:item},success:function(result){
                    alert(result);
            }})
            
        })
    })
    
    
    
</script>
