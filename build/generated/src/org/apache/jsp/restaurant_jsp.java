package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.restaurant;

public final class restaurant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    String username = (String)session.getAttribute("username");
    restaurant obj = new restaurant();


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <script src='https://kit.fontawesome.com/a076d05399.js' ></script>\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" >\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\" rel=\"stylesheet\">\n");
      out.write("<title>Login</title>\n");
      out.write("<style>\n");
      out.write("    #header\n");
      out.write("    {\n");
      out.write("        color:orange;\n");
      out.write("        margin-left: 38%;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    <!--<img src=\"1.jpg\" class=\"img-responsive\" alt=\"...\" style=\"width: 1000px;height: 672px;position:fixed; margin-top: 0px\">-->\n");
      out.write("       <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header col-md-12 col-sm-12 col-xs-12 col-lg-12\">\n");
      out.write("                <h1 id=\"header\">RESTAURANT</h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid\" style=\"margin-top:100px\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 col-lg-3 col-sm-12 col-xs-12\">\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <h2><label for=\"Username\" class=\"control-label\" style=\"color:blue\">Username</label></h2>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter Username\" name=\"username\" id=\"username\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <h2><label for=\"password\" class=\"control-label\" style=\"color:blue\">Password</label></h2>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"Enter password\" name=\"password\" id=\"password\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <h2><label for=\"email\" class=\"control-label\" style=\"color:blue\">Email</label></h2>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter email\" name=\"email\" id=\"mail\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <h2><label for=\"number\" class=\"control-label\" style=\"color:blue\">Number</label></h2>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter number\" name=\"number\" id=\"login_number\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <button id = \"submit\" class=\"btn btn-success\" style=\"margin-top:  5px\">Submit</button>\n");
      out.write("                <p id =\"demo\"></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#submit\").on(\"click\",function(){\n");
      out.write("            \n");
      out.write("            var n = $(\"#login_number\").val();\n");
      out.write("            var user = $(\"#username\").val();\n");
      out.write("            var mail = $(\"#mail\").val();\n");
      out.write("            var password =$(\"#password\").val();\n");
      out.write("            if(n==\"\" || user ==\"\" || mail==\"\" || password==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Please enter the details !!!\");\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("             else{\n");
      out.write("                 \n");
      out.write("            $.ajax({url:\"login_check\",data:{number:n,username:user},success:function(result){\n");
      out.write("                   \n");
      out.write("                   if(result===\"ADMIN\")\n");
      out.write("                   {\n");
      out.write("                       window.location.href = \"Admin.jsp\";\n");
      out.write("                   }\n");
      out.write("                   else if (result===\"CUSTOMER\")\n");
      out.write("                   {\n");
      out.write("                      $.ajax({url:\"create\",data:{number:n,username:user},success:function(result){\n");
      out.write("                              alert(result);\n");
      out.write("                               window.location.href = \"Customer.jsp\";\n");
      out.write("                      }});\n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("                    }\n");
      out.write("                   else if (result===\"COOKING_TEAM\")\n");
      out.write("                   {\n");
      out.write("                       window.location.href = \"Cooking_Team.jsp\";\n");
      out.write("                    }\n");
      out.write("                   else if (result===\"SERVER\")\n");
      out.write("                   {\n");
      out.write("                       window.location.href = \"Server.jsp\";\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        \n");
      out.write("                      alert(\"new\");\n");
      out.write("                      \n");
      out.write("                       \n");
      out.write("                      $.ajax({url:\"update\",data:{number:n,username:user, pass:password,email:mail},success:function(result){\n");
      out.write("                        \n");
      out.write("                              window.location.href = \"Customer.jsp\";\n");
      out.write("                      }});\n");
      out.write("                  \n");
      out.write("                    }\n");
      out.write("            }});\n");
      out.write("    }\n");
      out.write("        })\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            });\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("  ");
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
