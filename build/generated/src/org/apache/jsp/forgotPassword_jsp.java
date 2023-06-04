package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- forgot-password24:03-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                    <script src=\"assets/js/html5shiv.min.js\"></script>\n");
      out.write("                    <script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("            <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-wrapper account-wrapper\">\n");
      out.write("            <div class=\"account-page\">\n");
      out.write("                <div class=\"account-center\">\n");
      out.write("                    <div class=\"account-box\">\n");
      out.write("                        <form class=\"form-signin\" action=\"#\">\n");
      out.write("                            <div class=\"account-logo\">\n");
      out.write("                                <a href=\"index-2.html\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nhập Email của bạn</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group text-center\">\n");
      out.write("                                <button class=\"btn btn-primary account-btn\" type=\"submit\">Cài lại mật khẩu</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-center register-link\">\n");
      out.write("                                <a href=\"login.jsp\">Quay về đăng nhập</a>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- forgot-password24:03-->\n");
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
