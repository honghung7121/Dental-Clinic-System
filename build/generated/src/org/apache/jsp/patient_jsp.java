package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/dataTables.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-wrapper\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header-left\">\n");
      out.write("                    <a href=\"index-2.html\" class=\"logo\">\n");
      out.write("                        <img src=\"assets/img/logo.png\" width=\"35\" height=\"35\" alt=\"\"> <span>DentCare</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <a id=\"toggle_btn\" href=\"javascript:void(0);\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <a id=\"mobile_btn\" class=\"mobile_btn float-left\" href=\"#sidebar\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <ul class=\"nav user-menu float-right\">\n");
      out.write("                    <li class=\"nav-item dropdown d-none d-sm-block\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\"><i class=\"fa fa-bell-o\"></i> <span class=\"badge badge-pill bg-danger float-right\">3</span></a>\n");
      out.write("                        <div class=\"dropdown-menu notifications\">\n");
      out.write("                            <div class=\"topnav-dropdown-header\">\n");
      out.write("                                <span>Notifications</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"drop-scroll\">\n");
      out.write("                                <ul class=\"notification-list\">\n");
      out.write("                                    <li class=\"notification-message\">\n");
      out.write("                                        <a href=\"activities.html\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <span class=\"avatar\">\n");
      out.write("                                                    <img alt=\"John Doe\" src=\"assets/img/user.jpg\" class=\"img-fluid\">\n");
      out.write("                                                </span>\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p class=\"noti-details\"><span class=\"noti-title\">John Doe</span> added new task <span class=\"noti-title\">Patient appointment booking</span></p>\n");
      out.write("                                                    <p class=\"noti-time\"><span class=\"notification-time\">4 mins ago</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"notification-message\">\n");
      out.write("                                        <a href=\"activities.html\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <span class=\"avatar\">V</span>\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p class=\"noti-details\"><span class=\"noti-title\">Tarah Shropshire</span> changed the task name <span class=\"noti-title\">Appointment booking with payment gateway</span></p>\n");
      out.write("                                                    <p class=\"noti-time\"><span class=\"notification-time\">6 mins ago</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"notification-message\">\n");
      out.write("                                        <a href=\"activities.html\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <span class=\"avatar\">L</span>\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p class=\"noti-details\"><span class=\"noti-title\">Misty Tison</span> added <span class=\"noti-title\">Domenic Houston</span> and <span class=\"noti-title\">Claire Mapes</span> to project <span class=\"noti-title\">Doctor available module</span></p>\n");
      out.write("                                                    <p class=\"noti-time\"><span class=\"notification-time\">8 mins ago</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"notification-message\">\n");
      out.write("                                        <a href=\"activities.html\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <span class=\"avatar\">G</span>\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p class=\"noti-details\"><span class=\"noti-title\">Rolland Webber</span> completed task <span class=\"noti-title\">Patient and Doctor video conferencing</span></p>\n");
      out.write("                                                    <p class=\"noti-time\"><span class=\"notification-time\">12 mins ago</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"notification-message\">\n");
      out.write("                                        <a href=\"activities.html\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <span class=\"avatar\">V</span>\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p class=\"noti-details\"><span class=\"noti-title\">Bernardo Galaviz</span> added new task <span class=\"noti-title\">Private chat module</span></p>\n");
      out.write("                                                    <p class=\"noti-time\"><span class=\"notification-time\">2 days ago</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"topnav-dropdown-footer\">\n");
      out.write("                                <a href=\"activities.html\">View all Notifications</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown d-none d-sm-block\">\n");
      out.write("                        <a href=\"javascript:void(0);\" id=\"open_msg_box\" class=\"hasnotifications nav-link\"><i class=\"fa fa-comment-o\"></i> <span class=\"badge badge-pill bg-danger float-right\">8</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown has-arrow\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle nav-link user-link\" data-toggle=\"dropdown\">\n");
      out.write("                            <span class=\"user-img\"><img class=\"rounded-circle\" src=\"assets/img/user.jpg\" width=\"40\" alt=\"Admin\">\n");
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
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-inner slimscroll\">\n");
      out.write("                    <div id=\"sidebar-menu\" class=\"sidebar-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"menu-title\">Main</li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index-2.html\"><i class=\"fa fa-dashboard\"></i> <span>Dashboard</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"doctors.html\"><i class=\"fa fa-user-md\"></i> <span>Bác Sĩ</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"patients.html\"><i class=\"fa fa-wheelchair\"></i> <span>Bệnh Nhân</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"appointments.html\"><i class=\"fa fa-calendar\"></i> <span>Cuộc Hẹn</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"schedule.html\"><i class=\"fa fa-calendar-check-o\"></i> <span>Lịch Bác Sĩ</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"submenu\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-user\"></i> <span> Nhân Viên </span> <span class=\"menu-arrow\"></span></a>\n");
      out.write("                                <ul style=\"display: none;\">\n");
      out.write("                                    <li><a href=\"employees.html\">Danh Sách Nhân Viên</a></li>\n");
      out.write("                                    <li><a href=\"holidays.html\">Ngày Nghỉ</a></li>\n");
      out.write("                                    <li><a href=\"attendance.html\">Điểm Danh</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"submenu\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-money\"></i> <span> Tài Khoản </span> <span class=\"menu-arrow\"></span></a>\n");
      out.write("                                <ul style=\"display: none;\">\n");
      out.write("                                    <li><a href=\"invoices.html\">Hoá Đơn</a></li>\n");
      out.write("                                    <li><a href=\"payments.html\">Thanh Toán</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"settings.html\"><i class=\"fa fa-cog\"></i> <span>Cài Đặt</span></a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4 col-3\">\n");
      out.write("                            <h4 class=\"page-title\">Quản Lý Bệnh Nhân</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-8 col-9 text-right m-b-20\">\n");
      out.write("                            <a href=\"add-patient.html\" class=\"btn btn btn-primary btn-rounded float-right\"><i class=\"fa fa-plus\"></i> Thêm Bệnh Nhân</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-border table-striped custom-table datatable mb-0\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Họ và Tên</th>\n");
      out.write("                                            <th>Số điện thoại</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th class=\"text-right\">Action</th>\n");
      out.write("                                            <th class=\"text-right\">\n");
      out.write("                                                <div class=\"dropdown dropdown-action\">\n");
      out.write("                                                    <a href=\"#\" class=\"action-icon dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"edit-patient.html\"><i class=\"fa fa-pencil m-r-5\"></i> Edit</a>\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#delete_patient\"><i class=\"fa fa-trash-o m-r-5\"></i> Delete</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                        </tr>    \n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </body>\n");
      out.write("                                            </html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.patient}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("acc");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <th>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</th>\n");
          out.write("                                        <th>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</th>\n");
          out.write("                                         <th>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</th>\n");
          out.write("                                        \n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getFullName()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getPhoneNumber()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getEmail()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
