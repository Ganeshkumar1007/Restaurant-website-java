package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.restaurant;
import java.util.ArrayList;
import java.sql.*;

public final class Cooking_005fTeam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");


    ArrayList<String> hai = new ArrayList();
    ArrayList<String> bye = new ArrayList();
    restaurant obj = new restaurant();
    hai = obj.server_names();

    String username = (String)session.getAttribute("username");
    String seat = (String)session.getAttribute("seat_number");



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
      out.write("        <title>Cooking_Team Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cooking_Team</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                   ");

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
                       
      out.write("\n");
      out.write("                 <div style=\"margin-left: 5px\"  >  \n");
      out.write("                 <h1>Customer Name : ");
      out.print(rst.getString(2));
      out.write("</h1>\n");
      out.write("                 <h2>Seat Number : ");
      out.print(rst.getString(1));
      out.write("</h2>\n");
      out.write("                 <table class=\"table table-striped\">\n");
      out.write("                     <thead style=\"background-color: black;color:white\">\n");
      out.write("                         \n");
      out.write("                         <tr>\n");
      out.write("                        <th>S.No</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                     </thead>\n");
      out.write("                     <tbody>\n");
      out.write("                         ");

                            ArrayList<ArrayList> hai1 = new ArrayList();
                            hai1 = obj.order_details(rst.getString(4));
                            for(ArrayList<String> y : hai1)
                            {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                ");

                                    for(String x :y)
                                    {
      out.write("\n");
      out.write("                                    <td>");
      out.print(x);
      out.write("</td>\n");
      out.write("                                    ");
}
                                
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
                            
                         
      out.write("  \n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                \n");
      out.write("\n");
      out.write("                            \n");
      out.write("                     </tbody>\n");
      out.write("                 </table>\n");
      out.write("                         <div id=\"ar\" style=\"align-items:center\">\n");
      out.write("                             \n");
      out.write("                             <p style=\"text-align: center\"><button style=\"display: inline;margin-right: 10px\"   class=\"btn btn-primary order_ready \">Order Ready</button></p>\n");
      out.write("                             \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                         </div>\n");
      out.write("                         <h3 id=\"status\" style=\"margin-left: 5px\"></h3>\n");
      out.write("                    <hr style=\"border: 5px violet solid\">\n");
      out.write("                   </div>\n");
      out.write("                 ");

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
        
        
        
        
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"body\").on(\"click\",\".order_ready\",function(e){\n");
      out.write("            var a = e.target.parentElement.parentElement.nextElementSibling;\n");
      out.write("            a.innerHTML=\"Order Ready\";\n");
      out.write("            a.style.color=\"green\";\n");
      out.write("            var b = e.target.parentElement.parentElement;\n");
      out.write("            b.style.display=\"none\";\n");
      out.write("            var col = \"status\";\n");
      out.write("            var res = \"ORDER_READY\";\n");
      out.write("            var c = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling;\n");
      out.write("            var d = c.innerHTML;\n");
      out.write("            var f = d.split(\" \");\n");
      out.write("            \n");
      out.write("            console.log(f[3]);\n");
      out.write("            \n");
      out.write("            var g = e.target.parentElement.parentElement.previousElementSibling.previousElementSibling.previousElementSibling.innerHTML;\n");
      out.write("            var h = g.split(\" \");\n");
      out.write("            console.log(h[3]);\n");
      out.write("            \n");
      out.write("            $.ajax({url:\"updatestatus\",data:{seat:f[3],customer:h[3],val:res,column:col},success:function(result){\n");
      out.write("                    alert(result);\n");
      out.write("            }});\n");
      out.write("        })\n");
      out.write("    })\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
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
