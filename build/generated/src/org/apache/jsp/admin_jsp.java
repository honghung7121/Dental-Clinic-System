package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setLocale_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setLocale_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.release();
    _jspx_tagPool_fmt_setLocale_value_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- index22:59-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div class=\"main-wrapper\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            ");
      if (_jspx_meth_fmt_setLocale_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"page-wrapper\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-lg-6 col-xl-3\">\r\n");
      out.write("                            <div class=\"dash-widget\">\r\n");
      out.write("                                <span class=\"dash-widget-bg1\"><i class=\"ri-money-dollar-box-line\"></i></span>\r\n");
      out.write("                                <div class=\"dash-widget-info text-right\">\r\n");
      out.write("                                    <h3>  ");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write(" </h3>\r\n");
      out.write("                                  \r\n");
      out.write("                                    <span class=\"widget-title1\">Thu Nhập <i class=\"fa fa-check\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-lg-6 col-xl-3\">\r\n");
      out.write("                            <div class=\"dash-widget\">\r\n");
      out.write("                                <span class=\"dash-widget-bg2\"><i class=\"ri-empathize-line\"></i></span>\r\n");
      out.write("                                <div class=\"dash-widget-info text-right\">\r\n");
      out.write("                                    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PATIENT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                                    <span class=\"widget-title2\">Bệnh Nhân <i class=\"fa fa-check\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-lg-6 col-xl-3\">\r\n");
      out.write("                            <div class=\"dash-widget\">\r\n");
      out.write("                                <span class=\"dash-widget-bg3\"><i class=\"fa fa-user-md\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                <div class=\"dash-widget-info text-right\">\r\n");
      out.write("                                    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${DENTIST}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                                    <span class=\"widget-title3\">Bác Sĩ <i class=\"fa fa-check\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-lg-6 col-xl-3\">\r\n");
      out.write("                            <div class=\"dash-widget\">\r\n");
      out.write("                                <span class=\"dash-widget-bg4\"><i class=\"ri-calendar-todo-fill\"></i></span>\r\n");
      out.write("                                <div class=\"dash-widget-info text-right\">\r\n");
      out.write("                                    <h3>217</h3>\r\n");
      out.write("                                    <span class=\"widget-title4\">Lịch Khám <i class=\"fa fa-check\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"chart-title\">\r\n");
      out.write("                                        <h4>Tổng số bệnh nhân</h4>\r\n");
      out.write("                                        <span class=\"float-right\"><i class=\"fa fa-caret-up\" aria-hidden=\"true\"></i> 15% Cao hơn tháng trước</span>\r\n");
      out.write("                                    </div>\t\r\n");
      out.write("                                    <canvas id=\"linegraph\"></canvas>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-12 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"chart-title\">\r\n");
      out.write("                                        <h4>Thống kê bệnh nhân</h4>\r\n");
      out.write("                                        <div class=\"float-right\">\r\n");
      out.write("                                            <ul class=\"chat-user-total\">\r\n");
      out.write("                                                <li><i class=\"fa fa-circle current-users\" aria-hidden=\"true\"></i>ICU</li>\r\n");
      out.write("                                                <li><i class=\"fa fa-circle old-users\" aria-hidden=\"true\"></i> OPD</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\t\r\n");
      out.write("                                    <canvas id=\"bargraph\"></canvas>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12 col-md-6 col-lg-8 col-xl-8\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-header\">\r\n");
      out.write("                                    <h4 class=\"card-title d-inline-block\">Cuộc hẹn sắp tới</h4> <a href=\"appointments.html\" class=\"btn btn-primary float-right\">Xem tất cả</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body p-0\">\r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table mb-0\">\r\n");
      out.write("                                            <thead >\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Tên bệnh nhân</th>\r\n");
      out.write("                                                    <th>Tên bác sĩ</th>\r\n");
      out.write("                                                    <th>Thời gian</th>\r\n");
      out.write("                                                    <th class=\"text-right\">Trạng thái</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td style=\"min-width: 200px;\">\r\n");
      out.write("                                                        <a class=\"avatar\" href=\"profile.html\">B</a>\r\n");
      out.write("                                                        <h2><a href=\"profile.html\">Bernardo Galaviz <span>New York, USA</span></a></h2>\r\n");
      out.write("                                                    </td>                 \r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Cuộc hẹn với</h5>\r\n");
      out.write("                                                        <p>Dr. Thảo</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Thời gian</h5>\r\n");
      out.write("                                                        <p>7.00 PM</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td class=\"text-right\">\r\n");
      out.write("                                                        <a href=\"appointments.html\" class=\"btn btn-outline-primary take-btn\">Take up</a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td style=\"min-width: 200px;\">\r\n");
      out.write("                                                        <a class=\"avatar\" href=\"profile.html\">B</a>\r\n");
      out.write("                                                        <h2><a href=\"profile.html\">Bernardo Galaviz <span>New York, USA</span></a></h2>\r\n");
      out.write("                                                    </td>                 \r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Cuộc hẹn với</h5>\r\n");
      out.write("                                                        <p>Dr.Bình</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Thời gian</h5>\r\n");
      out.write("                                                        <p>8.00 PM</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td class=\"text-right\">\r\n");
      out.write("                                                        <a href=\"appointments.html\" class=\"btn btn-outline-primary take-btn\">Take up</a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td style=\"min-width: 200px;\">\r\n");
      out.write("                                                        <a class=\"avatar\" href=\"profile.html\">B</a>\r\n");
      out.write("                                                        <h2><a href=\"profile.html\">Bernardo Galaviz <span>New York, USA</span></a></h2>\r\n");
      out.write("                                                    </td>                 \r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Cuộc hẹn với</h5>\r\n");
      out.write("                                                        <p>Dr. Hưng</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Thời gian</h5>\r\n");
      out.write("                                                        <p>9.00 PM</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td class=\"text-right\">\r\n");
      out.write("                                                        <a href=\"appointments.html\" class=\"btn btn-outline-primary take-btn\">Take up</a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td style=\"min-width: 200px;\">\r\n");
      out.write("                                                        <a class=\"avatar\" href=\"profile.html\">B</a>\r\n");
      out.write("                                                        <h2><a href=\"profile.html\">Bernardo Galaviz <span>New York, USA</span></a></h2>\r\n");
      out.write("                                                    </td>                 \r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Cuộc hẹn với</h5>\r\n");
      out.write("                                                        <p>Dr. Trí</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Thời gian</h5>\r\n");
      out.write("                                                        <p>10.00 PM</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td class=\"text-right\">\r\n");
      out.write("                                                        <a href=\"appointments.html\" class=\"btn btn-outline-primary take-btn\">Take up</a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td style=\"min-width: 200px;\">\r\n");
      out.write("                                                        <a class=\"avatar\" href=\"profile.html\">B</a>\r\n");
      out.write("                                                        <h2><a href=\"profile.html\">Bernardo Galaviz <span>New York, USA</span></a></h2>\r\n");
      out.write("                                                    </td>                 \r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Cuộc hẹn với</h5>\r\n");
      out.write("                                                        <p>Dr. Nhựt</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <h5 class=\"time-title p-0\">Thời gian</h5>\r\n");
      out.write("                                                        <p>11.00 PM</p>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td class=\"text-right\">\r\n");
      out.write("                                                        <a href=\"appointments.html\" class=\"btn btn-outline-primary take-btn\">Take up</a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-12 col-md-6 col-lg-4 col-xl-4\">\r\n");
      out.write("                            <div class=\"card member-panel\">\r\n");
      out.write("                                <div class=\"card-header bg-white\">\r\n");
      out.write("                                    <h4 class=\"card-title mb-0\">Bác sĩ</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <ul class=\"contact-list\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"contact-cont\">\r\n");
      out.write("                                                <div class=\"float-left user-img m-r-10\">\r\n");
      out.write("                                                    <a href=\"profile.html\" title=\"John Doe\"><img src=\"assets/img/user.jpg\" alt=\"\" class=\"w-40 rounded-circle\"><span class=\"status online\"></span></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"contact-info\">\r\n");
      out.write("                                                    <span class=\"contact-name text-ellipsis\">John Doe</span>\r\n");
      out.write("                                                    <span class=\"contact-date\">MBBS, MD</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"contact-cont\">\r\n");
      out.write("                                                <div class=\"float-left user-img m-r-10\">\r\n");
      out.write("                                                    <a href=\"profile.html\" title=\"Richard Miles\"><img src=\"assets/img/user.jpg\" alt=\"\" class=\"w-40 rounded-circle\"><span class=\"status offline\"></span></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"contact-info\">\r\n");
      out.write("                                                    <span class=\"contact-name text-ellipsis\">Richard Miles</span>\r\n");
      out.write("                                                    <span class=\"contact-date\">MD</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"contact-cont\">\r\n");
      out.write("                                                <div class=\"float-left user-img m-r-10\">\r\n");
      out.write("                                                    <a href=\"profile.html\" title=\"John Doe\"><img src=\"assets/img/user.jpg\" alt=\"\" class=\"w-40 rounded-circle\"><span class=\"status away\"></span></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"contact-info\">\r\n");
      out.write("                                                    <span class=\"contact-name text-ellipsis\">John Doe</span>\r\n");
      out.write("                                                    <span class=\"contact-date\">BMBS</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"contact-cont\">\r\n");
      out.write("                                                <div class=\"float-left user-img m-r-10\">\r\n");
      out.write("                                                    <a href=\"profile.html\" title=\"Richard Miles\"><img src=\"assets/img/user.jpg\" alt=\"\" class=\"w-40 rounded-circle\"><span class=\"status online\"></span></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"contact-info\">\r\n");
      out.write("                                                    <span class=\"contact-name text-ellipsis\">Richard Miles</span>\r\n");
      out.write("                                                    <span class=\"contact-date\">MS, MD</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"contact-cont\">\r\n");
      out.write("                                                <div class=\"float-left user-img m-r-10\">\r\n");
      out.write("                                                    <a href=\"profile.html\" title=\"John Doe\"><img src=\"assets/img/user.jpg\" alt=\"\" class=\"w-40 rounded-circle\"><span class=\"status offline\"></span></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"contact-info\">\r\n");
      out.write("                                                    <span class=\"contact-name text-ellipsis\">John Doe</span>\r\n");
      out.write("                                                    <span class=\"contact-date\">MBBS</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"contact-cont\">\r\n");
      out.write("                                                <div class=\"float-left user-img m-r-10\">\r\n");
      out.write("                                                    <a href=\"profile.html\" title=\"Richard Miles\"><img src=\"assets/img/user.jpg\" alt=\"\" class=\"w-40 rounded-circle\"><span class=\"status away\"></span></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"contact-info\">\r\n");
      out.write("                                                    <span class=\"contact-name text-ellipsis\">Richard Miles</span>\r\n");
      out.write("                                                    <span class=\"contact-date\">MBBS, MD</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer text-center bg-white\">\r\n");
      out.write("                                    <a href=\"MainController?action=dentist\" class=\"text-muted\">Xem tất cả bác sĩ</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12 col-md-6 col-lg-8 col-xl-8\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-header\">\r\n");
      out.write("                                    <h4 class=\"card-title d-inline-block\">Bệnh nhân mới </h4> <a href=\"patients.html\" class=\"btn btn-primary float-right\">Xem tất cả</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-block\">\r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table mb-0 new-patient-table\">\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <img width=\"28\" height=\"28\" class=\"rounded-circle\" src=\"assets/img/user.jpg\" alt=\"\"> \r\n");
      out.write("                                                        <h2>John Doe</h2>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>Johndoe21@gmail.com</td>\r\n");
      out.write("                                                    <td>+1-202-555-0125</td>\r\n");
      out.write("                                                    <td><button class=\"btn btn-primary btn-primary-one float-right\">Lấy tuỷ</button></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <img width=\"28\" height=\"28\" class=\"rounded-circle\" src=\"assets/img/user.jpg\" alt=\"\"> \r\n");
      out.write("                                                        <h2>Richard</h2>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>Richard123@yahoo.com</td>\r\n");
      out.write("                                                    <td>202-555-0127</td>\r\n");
      out.write("                                                    <td><button class=\"btn btn-primary btn-primary-two float-right\">Niềng răng</button></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <img width=\"28\" height=\"28\" class=\"rounded-circle\" src=\"assets/img/user.jpg\" alt=\"\"> \r\n");
      out.write("                                                        <h2>Villiam</h2>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>Richard123@yahoo.com</td>\r\n");
      out.write("                                                    <td>+1-202-555-0106</td>\r\n");
      out.write("                                                    <td><button class=\"btn btn-primary btn-primary-three float-right\">Nhổ răng</button></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <img width=\"28\" height=\"28\" class=\"rounded-circle\" src=\"assets/img/user.jpg\" alt=\"\"> \r\n");
      out.write("                                                        <h2>Martin</h2>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>Richard123@yahoo.com</td>\r\n");
      out.write("                                                    <td>776-2323 89562015</td>\r\n");
      out.write("                                                    <td><button class=\"btn btn-primary btn-primary-four float-right\">Tẩy trắng</button></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-12 col-md-6 col-lg-4 col-xl-4\">\r\n");
      out.write("                            <div class=\"hospital-barchart\">\r\n");
      out.write("                                <h4 class=\"card-title d-inline-block\">Hospital Management</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"bar-chart\">\r\n");
      out.write("                                <div class=\"legend\">\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <h4>Level1</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <h4>Level2</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item text-right\">\r\n");
      out.write("                                        <h4>Level3</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item text-right\">\r\n");
      out.write("                                        <h4>Level4</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"chart clearfix\">\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <div class=\"bar\">\r\n");
      out.write("                                            <span class=\"percent\">16%</span>\r\n");
      out.write("                                            <div class=\"item-progress\" data-percent=\"16\">\r\n");
      out.write("                                                <span class=\"title\">OPD Patient</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <div class=\"bar\">\r\n");
      out.write("                                            <span class=\"percent\">71%</span>\r\n");
      out.write("                                            <div class=\"item-progress\" data-percent=\"71\">\r\n");
      out.write("                                                <span class=\"title\">New Patient</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <div class=\"bar\">\r\n");
      out.write("                                            <span class=\"percent\">82%</span>\r\n");
      out.write("                                            <div class=\"item-progress\" data-percent=\"82\">\r\n");
      out.write("                                                <span class=\"title\">Laboratory Test</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <div class=\"bar\">\r\n");
      out.write("                                            <span class=\"percent\">67%</span>\r\n");
      out.write("                                            <div class=\"item-progress\" data-percent=\"67\">\r\n");
      out.write("                                                <span class=\"title\">Treatment</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <div class=\"bar\">\r\n");
      out.write("                                            <span class=\"percent\">30%</span>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                            <div class=\"item-progress\" data-percent=\"30\">\r\n");
      out.write("                                                <span class=\"title\">Discharge</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User.getRoleID() != 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("login.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_fmt_setLocale_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_0.setParent(null);
    _jspx_th_fmt_setLocale_0.setValue(new String("vi_VN"));
    int _jspx_eval_fmt_setLocale_0 = _jspx_th_fmt_setLocale_0.doStartTag();
    if (_jspx_th_fmt_setLocale_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_0);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${REVENUE}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setType("currency");
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }
}
