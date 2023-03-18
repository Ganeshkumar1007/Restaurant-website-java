package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;;
import main.restaurant;;

public final class Customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

String username = (String)session.getAttribute("username");

restaurant obj = new restaurant();
ArrayList<String> hai = new ArrayList();
hai = obj.seat();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <title>Customer Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header col-md-12 col-sm-12 col-xs-12 col-lg-12\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#menu\" id=\"toggle\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    \n");
      out.write("                </button>\n");
      out.write("                    <h1 style=\"color:orange\">Restaurant</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"menu\">\n");
      out.write("                \n");
      out.write("                 <!--<form action=\"delete\" class=\"navbar-right  navbar-btn\">-->\n");
      out.write("                    <button style=\"margin-left: 10px;margin-top:8px\" onclick=\"delete()\" class=\"btn btn-success\">Logout</button>\n");
      out.write("                <!--</form>-->\n");
      out.write("                \n");
      out.write("            <ul class=\"nav navbar-nav navbar-right \" style=\"margin-top:8px\">\n");
      out.write("                <li><a href=\"#\" class=\"mx-auto\" ><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"mx-auto\"><i class=\"fa fa-info\"></i>  About</a></li>\n");
      out.write("                <li><a href=\"Contact.html\" class=\"mx-auto\"><i class=\"fa fa-phone\"></i>  Contact</a></li>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("               \n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("     <nav class=\"container-fluid\" style=\"margin-top:7%;width: 600px;display: none\" class=\"navbar navbar-fixed-top\" id=\"nav\">\n");
      out.write("         <!--<p style=\"text-align: center\"><button id=\"confirm_btn\" class=\"btn btn-lg btn-success\">Confirm order</button></p>-->\n");
      out.write("         <div style=\" border: 2px red solid;\" id=\"place\" >\n");
      out.write("             Total Price : ( <small><i class=\"fa fa-inr\"></i></small> )  <input type=\"text\" id =\"price\" name=\"price\" value=\"0\" disabled style=\"margin-top: 5px\">\n");
      out.write("            \n");
      out.write("                            \n");
      out.write("             Select  Table No. <select name=\"browser\" id=\"browser\" placeholder=\"select\">\n");
      out.write("                                    ");

                                    
                                        for(int i =1;i<8;i++)
                                            
                                        {
      out.write("\n");
      out.write("                                            <option value=\"select\" disabled selected hidden>select</option>\n");
      out.write("                                            <option style=\"display: initial\" class=\"opt\" value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                        ");
}
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                            </select>   \n");
      out.write("         <button  class=\"btn btn-success\" id =\"place_order\" style=\"margin-bottom: 5px;margin-left: 5px;margin-top:5px\" disabled>Place order</button>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container-fluid\" style=\"margin-top: 4%\">\n");
      out.write("            ");

         Connection con = null;
          try{
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/Restaurant","Ganesh","Ganesh@123");
          PreparedStatement pst = con.prepareStatement("select * from recipes ");
          ResultSet rst = pst.executeQuery();
          while(rst.next())
          {
      out.write("\n");
      out.write("              <section id = \"cards\" >\n");
      out.write("                \n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-6 col-xs-12\" style=\"padding-top: 20px;\">\n");
      out.write("                        <div class=\"card\" style=\"height: 380px\">\n");
      out.write("<!--                            <form action=\"\">-->\n");
      out.write("                            <img src=\"");
      out.print(rst.getString(6));
      out.write("\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\" id=\"name\">");
      out.print(rst.getString(2));
      out.write("</h5>\n");
      out.write("                            <input type=\"hidden\" name=\"");
      out.print(rst.getString(2));
      out.write("\" value=\"");
      out.print(rst.getString(2));
      out.write("\">\n");
      out.write("                            <h6>(per Item Rs.<strong>");
      out.print(rst.getInt(3));
      out.write("+ Tax(");
      out.print(rst.getInt(4));
      out.write(")</strong> )</h6>\n");
      out.write("                            <p style=\"text-align: center;display: none\"class=\"par\" ><button class=\" btn-danger  btn-1\">-</button><input style=\"width: 40px\" disabled><button class=\" btn-success btn-2\" >+</button></p>\n");
      out.write("                            <p style=\"text-align: center;margin-top: 10%;\"><button  class=\"btn btn-primary button\" id=\"add\">Add</button></p>\n");
      out.write("                            <p style=\"text-align: center;display: none\" >Amount:  <input id=\"amount\" value=\"0\" class=\"inputamt\" style=\"width:60px\"></p>\n");
      out.write("                            </div>\n");
      out.write("                            <!--</form>-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            <!--<img src=\"Images/mb.jpg\" class=\"card-img-top\" alt=\"...\">-->\n");
      out.write("                    \n");
      out.write("            </section>\n");
      out.write("          ");
}
            }   
            catch(Exception e)
            {
                System.out.println(e);
            }
        
        
        
        
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            var sum=0;\n");
      out.write("            var sum1=0;\n");
      out.write("             var options = document.getElementsByClassName(\"opt\");\n");
      out.write("                console.log(options.length);\n");
      out.write("               ");

               for(String x : hai)
               {
      out.write("\n");
      out.write("                   \n");
      out.write("                        for(var i=0;i<options.length;i++)\n");
      out.write("                        {\n");
      out.write("                           \n");
      out.write("                            if(options[i].value==");
      out.print(x);
      out.write(")\n");
      out.write("                            \n");
      out.write("                            {\n");
      out.write("                                console.log(options[i].value);\n");
      out.write("//                                console.log(options[i]);\n");
      out.write("                                var c = options[i];\n");
      out.write("                                c.style.display=\"none\";\n");
      out.write("                            }\n");
      out.write("//                            \n");
      out.write("                        }\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("             ");
  }
                
      out.write("\n");
      out.write("             delete()\n");
      out.write("             {\n");
      out.write("                alert(\"logout\")\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            $(\"body\").on(\"click\",\".button\",function(e){\n");
      out.write("                $(\"#nav\").css(\"display\",\"block\");\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var x = (e.target.parentElement.parentElement.children[3]);\n");
      out.write("                console.log(x.style.display=\"block\");\n");
      out.write("                var a = e.target;\n");
      out.write("                a.style.display=\"none\";\n");
      out.write("                x.children[1].value=1;\n");
      out.write("                var b = (e.target.parentElement.parentElement.children[1]);\n");
      out.write("                console.log(b.value);\n");
      out.write("                var val = b.value;\n");
      out.write("                var amt = (e.target.parentElement.nextElementSibling)\n");
      out.write("                amt.style.display=\"block\";\n");
      out.write("                \n");
      out.write("                var name = b.value;\n");
      out.write("               $.ajax({url:\"table\",data:{order_name:name},success:function(result){\n");
      out.write("                       //lert(result);\n");
      out.write("               }})\n");
      out.write("                \n");
      out.write("                $.ajax({url:\"price_and_tax\",data:{name:val},success:function(result){\n");
      out.write("                        \n");
      out.write("                        console.log(amt.children[0].value);\n");
      out.write("                        let text = result;\n");
      out.write("                         const a = text.split(\" \");\n");
      out.write("                         var price = parseInt(a[0]);\n");
      out.write("                         var tax = parseInt(a[1]);\n");
      out.write("                         console.log(price)\n");
      out.write("                         console.log(tax);\n");
      out.write("                         var amount = amt.children[0].value;\n");
      out.write("                         console.log(amount);\n");
      out.write("                         sum = parseInt(amount) + price + tax;\n");
      out.write("                         amt.children[0].value=sum;\n");
      out.write("                         var res1=0;\n");
      out.write("                         \n");
      out.write("                         var allElements = document.getElementsByClassName(\"inputamt\");\n");
      out.write("                        console.log(allElements.length)\n");
      out.write("                        for(var x=0;x<allElements.length;x++)\n");
      out.write("                        {\n");
      out.write("                            res1 = res1 + (parseInt(allElements[x].value));\n");
      out.write("                        }\n");
      out.write("                        console.log(res1);\n");
      out.write("                        $(\"#price\").val(res1);\n");
      out.write("                         \n");
      out.write("                }});\n");
      out.write("               \n");
      out.write("               \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("            $(\"#browser\").click(function(){\n");
      out.write("                var res = $(\"#browser\").val();\n");
      out.write("                console.log(res);\n");
      out.write("                if(res!==null)\n");
      out.write("                {\n");
      out.write("                  // console.log(\"12345\");\n");
      out.write("                   $( \"#place_order\" ).prop( \"disabled\", false );\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                  // console.log(\"12345\");\n");
      out.write("                   $( \"#place_order\" ).prop( \"disabled\", true );\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(\"#place_order\").on(\"click\",function(){\n");
      out.write("                var total=$(\"#price\").val();\n");
      out.write("                var seat = $(\"#browser\").val();\n");
      out.write("                $(\"#browser\").css(\"disabled\",\"true\");\n");
      out.write("                $.ajax({url:\"totalprice\",data:{tot:total,seatnumber:seat},success:function(result){\n");
      out.write("                        console.log(result);\n");
      out.write("                        window.location.href=\"place_order.jsp\"\n");
      out.write("                }});\n");
      out.write("            \n");
      out.write("                \n");
      out.write("            })\n");
      out.write("            \n");
      out.write("             $(\"body\").on(\"click\",\".btn-1\",function(e){\n");
      out.write("                var x = e.target.nextElementSibling;\n");
      out.write("                var i = x.value;\n");
      out.write("                x.value=parseInt(i)-1;\n");
      out.write("                var v = x.value;\n");
      out.write("                var b = (e.target.parentElement.parentElement.children[1]);\n");
      out.write("                \n");
      out.write("                var val = b.value;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                if(x.value==\"0\")\n");
      out.write("                {\n");
      out.write("                    var a = e.target.parentElement.parentElement.children[4];\n");
      out.write("                    a.children[0].style.display=\"initial\";\n");
      out.write("                    e.target.parentElement.style.display=\"none\";\n");
      out.write("                    var amt1 = e.target.parentElement.nextElementSibling.nextElementSibling\n");
      out.write("                    amt1.style.display=\"none\";\n");
      out.write("                }\n");
      out.write("                var ab = (e.target.parentElement.nextElementSibling.nextElementSibling.children[0]);\n");
      out.write("                console.log(ab);\n");
      out.write("                \n");
      out.write("                $.ajax({url:\"insert_table\",data:{name:val,number:v},success:function(result){\n");
      out.write("                        \n");
      out.write("                        console.log(result);\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                }});\n");
      out.write("            $.ajax({url:\"price_and_tax\",data:{name:val},success:function(result){\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        let text = result;\n");
      out.write("                         const a = text.split(\" \");\n");
      out.write("                         let price = parseInt(a[0]);\n");
      out.write("                         let tax = parseInt(a[1]);\n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("                         sum = parseInt(ab.value) - (price + tax);\n");
      out.write("                         console.log(sum);\n");
      out.write("                         ab.value=sum;\n");
      out.write("                         var res1=0;\n");
      out.write("                         \n");
      out.write("                         var allElements = document.getElementsByClassName(\"inputamt\");\n");
      out.write("                        console.log(allElements.length)\n");
      out.write("                        for(var x=0;x<allElements.length;x++)\n");
      out.write("                        {\n");
      out.write("                            res1 = res1 + (parseInt(allElements[x].value));\n");
      out.write("                        }\n");
      out.write("                        console.log(res1);\n");
      out.write("                        $(\"#price\").val(res1);\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                }});\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            $(\"body\").on(\"click\",\".btn-2\",function(e){\n");
      out.write("                \n");
      out.write("                var x = e.target.previousElementSibling;\n");
      out.write("                var i = x.value;\n");
      out.write("                x.value=parseInt(i)+1;\n");
      out.write("                var v = x.value;\n");
      out.write("                console.log(v)\n");
      out.write("                var b = (e.target.parentElement.parentElement.children[1]);\n");
      out.write("                \n");
      out.write("                var val = b.value;\n");
      out.write("                var ab = (e.target.parentElement.nextElementSibling.nextElementSibling.children[0])\n");
      out.write("                console.log(ab)\n");
      out.write("                console.log(val);  \n");
      out.write("                $.ajax({url:\"insert_table\",data:{name:val,number:v},success:function(result){\n");
      out.write("                        \n");
      out.write("                        console.log(result);\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                }});\n");
      out.write("                $.ajax({url:\"price_and_tax\",data:{name:val},success:function(result){\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        let text = result;\n");
      out.write("                         const a = text.split(\" \");\n");
      out.write("                         let price = parseInt(a[0]);\n");
      out.write("                         let tax = parseInt(a[1]);\n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("                         sum = (v * price) + (v * tax);\n");
      out.write("                         console.log(sum);\n");
      out.write("                         ab.value=sum;\n");
      out.write("                          var res1=0;\n");
      out.write("                         \n");
      out.write("                         var allElements = document.getElementsByClassName(\"inputamt\");\n");
      out.write("                        console.log(allElements.length)\n");
      out.write("                        for(var x=0;x<allElements.length;x++)\n");
      out.write("                        {\n");
      out.write("                            res1 = res1 + (parseInt(allElements[x].value));\n");
      out.write("                        }\n");
      out.write("                        console.log(res1);\n");
      out.write("                        $(\"#price\").val(res1);\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                }});\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
