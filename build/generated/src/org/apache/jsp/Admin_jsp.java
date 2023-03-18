package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
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
      out.write("        <title>Admin Page</title>\n");
      out.write("    </head>\n");
      out.write("   <style>\n");
      out.write("    #header\n");
      out.write("    {\n");
      out.write("        color:orange;\n");
      out.write("        margin-left: 38%;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header col-md-12 col-sm-12 col-xs-12 col-lg-12\">\n");
      out.write("                <h1 id=\"header\">RESTAURANT</h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("        <div class=\"container-fluid\" style=\"margin-top:10%\">\n");
      out.write("            <h1>Admin</h1><hr style=\"color: black\">\n");
      out.write("            <div id =\"main\">\n");
      out.write("                <button class=\"btn btn-danger\">Order History</button>\n");
      out.write("                <button class=\"btn btn-primary\" style=\"margin-left: 10px\" id=\"edit_orders\">Edit Orders</button><br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-lg-4 col-md-6 col-sm-12 col-xs-12\"style=\"margin-top: 15px;display: none\" id=\"login\">\n");
      out.write("                <form action=\"admin_login.jsp\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label\" style=\"font-size: 30px\">Username</label>\n");
      out.write("                    <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Enter username\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label\" style=\"font-size: 30px\" >Number</label>\n");
      out.write("                    <input type=\"text\" name=\"number\" class=\"form-control\" placeholder=\"Enter number\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <button id=\" submit\" class=\"btn btn-success\">Submit</button><br>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#edit_orders\").on(\"click\",function(){\n");
      out.write("            $(\"#login\").css(\"display\",\"block\");\n");
      out.write("            $(\"#main\").css(\"display\",\"none\");\n");
      out.write("            \n");
      out.write("        })\n");
      out.write("    })\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>");
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
