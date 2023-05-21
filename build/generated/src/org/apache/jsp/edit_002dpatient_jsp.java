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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-wrapper\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header-left\">\n");
      out.write("                    <a href=\"index-2.html\" class=\"logo\">\n");
      out.write("                        <img src=\"image/logo.png\" width=\"35\" height=\"35\" alt=\"\"> <span>Preclinic</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("               <ul class=\"nav user-menu float-right\">\n");
      out.write("                    <li class=\"nav-item dropdown has-arrow\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle nav-link user-link\" data-toggle=\"dropdown\">\n");
      out.write("                            <span class=\"user-img\"><img class=\"rounded-circle\" src=\"img/user.jpg\" width=\"40\" alt=\"Admin\">\n");
      out.write("                                <span class=\"status online\"></span></span>\n");
      out.write("                            <span>Admin</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"profile.html\">My Profile</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"edit-profile.html\">Edit Profile</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"settings.html\">Settings</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"login.html\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"dropdown mobile-user-menu float-right\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"profile.html\">My Profile</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"edit-profile.html\">Edit Profile</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"settings.html\">Settings</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"login.html\">Logout</a>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-inner slimscroll\">\n");
      out.write("                    <div id=\"sidebar-menu\" class=\"sidebar-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"menu-title\">Main</li>\n");
      out.write("                            <li >\n");
      out.write("                                <a href=\"index-2.html\"><i class=\"fa fa-dashboard\"></i> <span>Dashboard</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li >\n");
      out.write("                                <a href=\"doctors.html\"><i class=\"fa fa-user-md\"></i> <span>Bác Sĩ</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"patients.html\"><i class=\"fa fa-wheelchair\"></i> <span>Bệnh Nhân</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"appointments.html\"><i class=\"fa fa-calendar\"></i> <span>Cuộc Hẹn</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"schedule.html\"><i class=\"fa fa-calendar-check-o\"></i> <span>Doctor Schedule</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"departments.html\"><i class=\"fa fa-hospital-o\"></i> <span>Departments</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"submenu\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-user\"></i> <span> Employees </span> <span class=\"menu-arrow\"></span></a>\n");
      out.write("                                <ul style=\"display: none;\">\n");
      out.write("                                    <li><a href=\"employees.html\">Employees List</a></li>\n");
      out.write("                                    <li><a href=\"leaves.html\">Leaves</a></li>\n");
      out.write("                                    <li><a href=\"holidays.html\">Holidays</a></li>\n");
      out.write("                                    <li><a href=\"attendance.html\">Attendance</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"submenu\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-money\"></i> <span> Accounts </span> <span class=\"menu-arrow\"></span></a>\n");
      out.write("                                <ul style=\"display: none;\">\n");
      out.write("                                    <li><a href=\"invoices.html\">Invoices</a></li>\n");
      out.write("                                    <li><a href=\"payments.html\">Payments</a></li>\n");
      out.write("                                    <li><a href=\"expenses.html\">Expenses</a></li>\n");
      out.write("                                    <li><a href=\"taxes.html\">Taxes</a></li>\n");
      out.write("                                    <li><a href=\"provident-fund.html\">Provident Fund</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\n");
      out.write("                            <h4 class=\"page-title\">Edit Patient</h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Họ và Tên <span class=\"text-danger\">*</span></label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Email <span class=\"text-danger\">*</span></label>\n");
      out.write("                                            <input class=\"form-control\" type=\"email\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Mật Khẩu</label>\n");
      out.write("                                            <input class=\"form-control\" type=\"password\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Nhập Lại Mật Khẩu</label>\n");
      out.write("                                            <input class=\"form-control\" type=\"password\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Phone </label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Avatar</label>\n");
      out.write("                                            <div class=\"profile-upload\">\n");
      out.write("                                                <div class=\"upload-img\">\n");
      out.write("                                                    <img alt=\"\" src=\"image/user.jpg\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"upload-input\">\n");
      out.write("                                                    <input type=\"file\" class=\"form-control\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"display-block\">Status</label>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"status\" id=\"product_active\" value=\"option1\" checked>\n");
      out.write("                                        <label class=\"form-check-label\" for=\"product_active\">\n");
      out.write("                                            Active\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"status\" id=\"product_inactive\" value=\"option2\">\n");
      out.write("                                        <label class=\"form-check-label\" for=\"product_inactive\">\n");
      out.write("                                            Inactive\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"m-t-20 text-center\">\n");
      out.write("                                    <button class=\"btn btn-primary submit-btn\">Lưu</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
