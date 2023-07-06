package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_002dpatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"main-wrapper\">\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <div class=\"header-left\">\r\n");
      out.write("                    <a href=\"index-2.html\" class=\"logo\">\r\n");
      out.write("                        <img src=\"assets/img/logo.png\" width=\"35\" height=\"35\" alt=\"\"> <span>DentCare</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav user-menu float-right\">\r\n");
      out.write("                    <li class=\"nav-item dropdown has-arrow\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle nav-link user-link\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <span class=\"user-img\"><img class=\"rounded-circle\" src=\"assets/img/user.jpg\" width=\"40\" alt=\"Admin\">\r\n");
      out.write("                                <span class=\"status online\"></span></span>\r\n");
      out.write("                            <span>Admin</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"profile.html\">My Profile</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"edit-profile.html\">Edit Profile</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"settings.html\">Settings</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"login.html\">Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"dropdown mobile-user-menu float-right\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"profile.html\">My Profile</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"edit-profile.html\">Edit Profile</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"settings.html\">Settings</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"login.html\">Logout</a>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"page-wrapper\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\r\n");
      out.write("                            <h4 class=\"page-title\">Edit Patient</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\r\n");
      out.write("                            <form action=\"MainController\" method=\"post\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Họ và Tên <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editdetail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"fullName\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Email <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editdetail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"temail\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Mật Khẩu</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editdetail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"tpassword\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Nhập Lại Mật Khẩu</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editdetail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"tpassword2\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Phone </label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editdetail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"phoneNumber\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                         <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Roll </label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editdetail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"Roll\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"display-block\">Status</label>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"status\" id=\"product_active\" value=\"option1\" checked>\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"product_active\">\r\n");
      out.write("                                            Active\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"status\" id=\"product_inactive\" value=\"option2\">\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"product_inactive\">\r\n");
      out.write("                                            Inactive\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"m-t-20 text-center\">\r\n");
      out.write("<!--                                    <button type=\"submit\" class=\"btn btn-primary submit-btn\">Lưu</button>-->\r\n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-primary submit-btn\" value=\"Luu\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>\r\n");
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
