<%-- 
    Document   : Customer
    Created on : 11 Jun, 2022, 1:12:00 PM
    Author     : Ganesh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*;"%>
<%@page import="main.restaurant;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
String username = (String)session.getAttribute("username");

restaurant obj = new restaurant();
ArrayList<String> hai = new ArrayList();
hai = obj.seat();
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
        <title>Customer Page</title>
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
                
                 <form action="delete" class="navbar-right  navbar-btn">
                    <button style="margin-left: 10px;margin-top:8px" id="logout" class="btn btn-danger">Logout</button>
                </form>
                
            <ul class="nav navbar-nav navbar-right " style="margin-top:8px">
                <li><a href="#" class="mx-auto" ><i class="fa fa-home"></i> Home</a></li>
                <li><a href="#" class="mx-auto"><i class="fa fa-info"></i>  About</a></li>
                <li><a href="Contact.html" class="mx-auto"><i class="fa fa-phone"></i>  Contact</a></li>
                


            </ul>
               

        </div> 
            </div>
            

        </div>

    </nav>
     <nav class="container-fluid" style="margin-top:7%;width: 600px;display: none" class="navbar navbar-fixed-top" id="nav">
         <!--<p style="text-align: center"><button id="confirm_btn" class="btn btn-lg btn-success">Confirm order</button></p>-->
         <div style=" border: 2px red solid;" id="place" >
             Total Price : ( <small><i class="fa fa-inr"></i></small> )  <input type="text" id ="price" name="price" value="0" disabled style="margin-top: 5px">
            
                            
             Select  Table No. <select name="browser" id="browser" placeholder="select">
                                    <%
                                    
                                        for(int i =1;i<8;i++)
                                            
                                        {%>
                                            <option value="select" disabled selected hidden>select</option>
                                            <option style="display: initial" class="opt" value="<%=i%>"><%=i%></option>
                                        <%}
                                    %>
                                    
                            </select>   
         <button  class="btn btn-success" id ="place_order" style="margin-bottom: 5px;margin-left: 5px;margin-top:5px" disabled>Place order</button>
            
            
         </div>
            
        </nav>
        <div class="container-fluid" style="margin-top: 4%">
            <%
         Connection con = null;
          try{
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/Restaurant","Ganesh","Ganesh@123");
          PreparedStatement pst = con.prepareStatement("select * from recipes ");
          ResultSet rst = pst.executeQuery();
          while(rst.next())
          {%>
              <section id = "cards" >
                
                    <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12" style="padding-top: 20px;">
                        <div class="card" style="height: 380px">
<!--                            <form action="">-->
                            <img src="<%=rst.getString(6)%>" class="card-img-top" alt="...">
                            <div class="card-body">
                            <h5 class="card-title" id="name"><%=rst.getString(2)%></h5>
                            <input type="hidden" name="<%=rst.getString(2)%>" value="<%=rst.getString(2)%>">
                            <h6>(per Item Rs.<strong><%=rst.getInt(3)%>+ Tax(<%=rst.getInt(4)%>)</strong> )</h6>
                            <p style="text-align: center;display: none"class="par" ><button class=" btn-danger  btn-1">-</button><input style="width: 40px" disabled><button class=" btn-success btn-2" >+</button></p>
                            <p style="text-align: center;margin-top: 10%;"><button  class="btn btn-primary button" id="add">Add</button></p>
                            <p style="text-align: center;display: none" >Amount:  <input id="amount" value="0" class="inputamt" style="width:60px"></p>
                            </div>
                            <!--</form>-->
                        </div>
                    </div>
            <!--<img src="Images/mb.jpg" class="card-img-top" alt="...">-->
                    
            </section>
          <%}
            }   
            catch(Exception e)
            {
                System.out.println(e);
            }
        
        
        
        %>
            
        </div>
        
        
    </body>
    
    
    
    <script>
        $(document).ready(function(){
            var sum=0;
            var sum1=0;
             var options = document.getElementsByClassName("opt");
                console.log(options.length);
               <%
               for(String x : hai)
               {%>
                   
                        for(var i=0;i<options.length;i++)
                        {
                           
                            if(options[i].value==<%=x%>)
                            
                            {
                                console.log(options[i].value);
//                                console.log(options[i]);
                                var c = options[i];
                                c.style.display="none";
                            }
//                            
                        }
                   
                   
                   
                  
             <%  }
                %>
             
            
            $("body").on("click",".button",function(e){
                $("#nav").css("display","block");
                
                
                
                
                
                
                
                var x = (e.target.parentElement.parentElement.children[3]);
                console.log(x.style.display="block");
                var a = e.target;
                a.style.display="none";
                x.children[1].value=1;
                var b = (e.target.parentElement.parentElement.children[1]);
                console.log(b.value);
                var val = b.value;
                var amt = (e.target.parentElement.nextElementSibling)
                amt.style.display="block";
                
                var name = b.value;
               $.ajax({url:"table",data:{order_name:name},success:function(result){
                       //lert(result);
               }})
                
                $.ajax({url:"price_and_tax",data:{name:val},success:function(result){
                        
                        console.log(amt.children[0].value);
                        let text = result;
                         const a = text.split(" ");
                         var price = parseInt(a[0]);
                         var tax = parseInt(a[1]);
                         console.log(price)
                         console.log(tax);
                         var amount = amt.children[0].value;
                         console.log(amount);
                         sum = parseInt(amount) + price + tax;
                         amt.children[0].value=sum;
                         var res1=0;
                         
                         var allElements = document.getElementsByClassName("inputamt");
                        console.log(allElements.length)
                        for(var x=0;x<allElements.length;x++)
                        {
                            res1 = res1 + (parseInt(allElements[x].value));
                        }
                        console.log(res1);
                        $("#price").val(res1);
                         
                }});
               
               
            });
            
            
            
            $("#browser").click(function(){
                var res = $("#browser").val();
                console.log(res);
                if(res!==null)
                {
                  // console.log("12345");
                   $( "#place_order" ).prop( "disabled", false );
                }
                else
                {
                  // console.log("12345");
                   $( "#place_order" ).prop( "disabled", true );
                }
                
            });

            $("#place_order").on("click",function(){
                alert("asdflkjf;sakljfa;lksj");
                var total=$("#price").val();
                var seat = $("#browser").val();
                $("#browser").css("disabled","true");
                $.ajax({url:"totalprice",data:{tot:total,seatnumber:seat},success:function(result){
                        console.log(result);
                        window.location.href="place_order.jsp"
                }});
            
                
            })
            
             $("body").on("click",".btn-1",function(e){
                var x = e.target.nextElementSibling;
                var i = x.value;
                x.value=parseInt(i)-1;
                var v = x.value;
                var b = (e.target.parentElement.parentElement.children[1]);
                
                var val = b.value;
                
                
                if(x.value=="0")
                {
                    var a = e.target.parentElement.parentElement.children[4];
                    a.children[0].style.display="initial";
                    e.target.parentElement.style.display="none";
                    var amt1 = e.target.parentElement.nextElementSibling.nextElementSibling
                    amt1.style.display="none";
                }
                var ab = (e.target.parentElement.nextElementSibling.nextElementSibling.children[0]);
                console.log(ab);
                
                $.ajax({url:"insert_table",data:{name:val,number:v},success:function(result){
                        
                        console.log(result);
                        
                       
                         
                         
                }});
            $.ajax({url:"price_and_tax",data:{name:val},success:function(result){
                        
                        
                        
                        
                        let text = result;
                         const a = text.split(" ");
                         let price = parseInt(a[0]);
                         let tax = parseInt(a[1]);
                         
                        
                         sum = parseInt(ab.value) - (price + tax);
                         console.log(sum);
                         ab.value=sum;
                         var res1=0;
                         
                         var allElements = document.getElementsByClassName("inputamt");
                        console.log(allElements.length)
                        for(var x=0;x<allElements.length;x++)
                        {
                            res1 = res1 + (parseInt(allElements[x].value));
                        }
                        console.log(res1);
                        $("#price").val(res1);
                         
                         
                         
                }});
            });
            
            
            
            
            $("body").on("click",".btn-2",function(e){
                
                var x = e.target.previousElementSibling;
                var i = x.value;
                x.value=parseInt(i)+1;
                var v = x.value;
                console.log(v)
                var b = (e.target.parentElement.parentElement.children[1]);
                
                var val = b.value;
                var ab = (e.target.parentElement.nextElementSibling.nextElementSibling.children[0])
                console.log(ab)
                console.log(val);  
                $.ajax({url:"insert_table",data:{name:val,number:v},success:function(result){
                        
                        console.log(result);
                        
                       
                         
                         
                }});
                $.ajax({url:"price_and_tax",data:{name:val},success:function(result){
                        
                        
                        
                        
                        let text = result;
                         const a = text.split(" ");
                         let price = parseInt(a[0]);
                         let tax = parseInt(a[1]);
                         
                        
                         sum = (v * price) + (v * tax);
                         console.log(sum);
                         ab.value=sum;
                          var res1=0;
                         
                         var allElements = document.getElementsByClassName("inputamt");
                        console.log(allElements.length)
                        for(var x=0;x<allElements.length;x++)
                        {
                            res1 = res1 + (parseInt(allElements[x].value));
                        }
                        console.log(res1);
                        $("#price").val(res1);
                         
                         
                         
                }});
                
                
                
                
                
                
            });
            
            
           
            
        });
        
        
        
        
     </script>
</html>
