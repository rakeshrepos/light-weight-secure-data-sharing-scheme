package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import network.Save;

public final class down_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');


    String id = request.getParameter("id");
    session.setAttribute("idd", id);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title>LSDSS</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"layout/styles/layout.css\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("        <!-- Waterwheel Carousel -->\n");
      out.write("        <script type=\"text/javascript\" src=\"layout/scripts/carousel/jquery.waterwheelCarousel.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"layout/scripts/carousel/jquery.waterwheelCarousel.setup.js\"></script>\n");
      out.write("        <!-- / Waterwheel Carousel -->\n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("        <div class=\"wrapper col1\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div class=\"fl_left\">\n");
      out.write("                    <center><h1><a href=\"#\">A Lightweight Secure Data Sharing Scheme for Mobile Cloud Computing</a></h1></center>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"topbar\">\n");
      out.write("                <div id=\"topnav\">\n");
      out.write("                    <ul>\n");
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">DATA OWNER</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"olog.jsp\">LOGIN</a></li>\n");
      out.write("                                <li><a href=\"oreg.jsp\">REGISTRATION</a></li>           \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">DATA USER</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"ulog.jsp\">LOGIN</a></li>\n");
      out.write("                                <li><a href=\"ureg.jsp\">REGISTRATION</a></li>           \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"last\"><a href=\"talog.jsp\">TRUSTED AUTHORITY</a></li>\n");
      out.write("                        <li class=\"last\"><a href=\"cloudlog.jsp\">CLOUD</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>                \n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col3\">\n");
      out.write("            <div id=\"waterwheelCarousel\">\n");
      out.write("                <img style=\"width: 400px;height: 300px\" src=\"images/carousel/01.jpg\" alt=\"\" />\n");
      out.write("                <img style=\"width: 400px;height: 300px\" src=\"images/carousel/02.jpg\" alt=\"\" />\n");
      out.write("                <img style=\"width: 400px;height: 300px\" src=\"images/carousel/03.jpg\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/4.gif\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/5.gif\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/6.gif\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/7.gif\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/8.gif\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/9.gif\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/10.gif\" alt=\"\" />\n");
      out.write("                <img src=\"images/carousel/11.gif\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--#e60498-->\n");
      out.write("        <center><h2 style=\"color: #e60498 \">Verify The File Decryption Key</h2></center><br><br>\n");
      out.write("                <!-- ####################################################################################################### -->\n");
      out.write("                <div style=\"float: left;\">\n");
      out.write("                    <img style=\"width: 400px;height: 400px;float: left\" src=\"images/carousel/clouddown.png\" alt=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <div id=\"respond\" style=\"float: right;margin-right: 400px\" >\n");
      out.write("                    <form action=\"Save\" method=\"get\">\n");
      out.write("                        <p>              \n");
      out.write("                            <input style=\"width: 300px;height: 24px;\" type=\"text\" name=\"secretkey\" id=\"name\" /> &nbsp;&nbsp;\n");
      out.write("                            <label style=\"font-size: 21px;color: whitesmoke;font-style: italic\"for=\"name\">Enter Key</label>\n");
      out.write("                        </p><br>                           \n");
      out.write("                            <p><br>\n");
      out.write("                                    <input style=\"color:#A5066D \" name=\"submit\" type=\"submit\" id=\"submit\" value=\"Decrypt & Download\" />\n");
      out.write("                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                    <input style=\"color:#A5066D \" name=\"reset\" type=\"reset\" id=\"reset\" tabindex=\"5\" value=\"Reset Form\" />\n");
      out.write("                            </p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"wrapper col4\">                            \n");
      out.write("                    <div style=\"float: right;\" id=\"column\">\n");
      out.write("                        <div class=\"subnav\">\n");
      out.write("                            <h2 style=\"color: whitesmoke;font-style: italic\"> Menu Bar </h2>\n");
      out.write("                            <ul>                           \n");
      out.write("                                <li><a href=\"uhome.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"akreq.jsp\">Attribute Key Request</a></li>\n");
      out.write("                                <li><a href=\"fileaccess.jsp\">Access File</a></li>                                                                                                                                                                                           \n");
      out.write("                                <li><a href=\"ulog.jsp\">Logout</a></li>                            \n");
      out.write("                            </ul>\n");
      out.write("                        </div></div>               \n");
      out.write("                    <br class=\"clear\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- ####################################################################################################### -->\n");
      out.write("                </body>\n");
      out.write("                </html>");
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
