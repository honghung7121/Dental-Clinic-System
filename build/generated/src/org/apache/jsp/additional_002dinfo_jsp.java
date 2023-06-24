package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class additional_002dinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("\n");
      out.write("        <!-- Icon Font Stylesheet -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"lib/twentytwenty/twentytwenty.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("        <script src=\"lib/twentytwenty/jquery.event.move.js\"></script>\n");
      out.write("        <script src=\"lib/twentytwenty/jquery.twentytwenty.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Customized Login Stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: Tahoma, Arial, sans-serif;\n");
      out.write("                color: #06D85F;\n");
      out.write("                margin: 80px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .box {\n");
      out.write("                width: 40%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                background: rgba(255,255,255,0.2);\n");
      out.write("                padding: 35px;\n");
      out.write("                border: 2px solid #fff;\n");
      out.write("                border-radius: 20px/50px;\n");
      out.write("                background-clip: padding-box;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button {\n");
      out.write("                font-size: 1em;\n");
      out.write("                padding: 10px;\n");
      out.write("                color: #fff;\n");
      out.write("                border: 2px solid #06D85F;\n");
      out.write("                border-radius: 20px/50px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: all 0.3s ease-out;\n");
      out.write("            }\n");
      out.write("            .button:hover {\n");
      out.write("                background: #06D85F;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                background: rgba(0, 0, 0, 0.7);\n");
      out.write("                transition: opacity 500ms;\n");
      out.write("                visibility: hidden;\n");
      out.write("                opacity: 0;\n");
      out.write("            }\n");
      out.write("            .overlay:target {\n");
      out.write("                visibility: visible;\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .active{\n");
      out.write("                visibility: visible;\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .popup {\n");
      out.write("                margin: 70px auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background: #fff;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                width: 30%;\n");
      out.write("                position: relative;\n");
      out.write("                transition: all 5s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .popup h2 {\n");
      out.write("                margin-top: 0;\n");
      out.write("                color: #333;\n");
      out.write("                font-family: Tahoma, Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("            .popup .close {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                right: 30px;\n");
      out.write("                transition: all 200ms;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            .popup .close:hover {\n");
      out.write("                color: #06D85F;\n");
      out.write("            }\n");
      out.write("            .popup .content {\n");
      out.write("                max-height: 30%;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow-sm px-5 py-3 py-lg-0\">\n");
      out.write("            <a href=\"index.jsp\" class=\"navbar-brand p-0\">\n");
      out.write("                <h1 class=\"m-0 text-primary\"><i class=\"fa fa-tooth me-2\"></i>DentCare</h1>\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <div class=\"navbar-nav ms-auto py-0\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"nav-item nav-link\">Trang Chủ</a>\n");
      out.write("                    <a href=\"aboutus.jsp\" class=\"nav-item nav-link active\">Về Chúng Tôi</a>\n");
      out.write("                    <a href=\"ServiceUserController\" class=\"nav-item nav-link\">Dịch Vụ</a>\n");
      out.write("                    <div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Khác</a>\n");
      out.write("                        <div class=\"dropdown-menu m-0\">\n");
      out.write("                            <a href=\"price.html\" class=\"dropdown-item\">Bảng giá</a>\n");
      out.write("                            <a href=\"MainController?action=showDentist\" class=\"dropdown-item\">Nha sĩ của chúng tôi</a>\n");
      out.write("                            <a href=\"testimonial.html\" class=\"dropdown-item\">Chứng thực</a>\n");
      out.write("                            <a href=\"index.jsp\" class=\"dropdown-item\">Cuộc hẹn</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <a href=\"contact.jsp\" class=\"nav-item nav-link\">Liên Hệ</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <button type=\"button\" class=\"btn text-dark\" data-bs-toggle=\"modal\" data-bs-target=\"#searchModal\"><i\n");
      out.write("                        class=\"fa fa-search\"></i></button>\n");
      out.write("                <a href=\"appointment.html\" class=\"btn btn-primary py-2 px-4 ms-3\">Đăng Ký Cuộc Hẹn</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"login-wrap\">\n");
      out.write("            <div class=\"login-html\">\n");
      out.write("                <h4 class=\"tab\" style=\"color: white\">Tôi cần thêm thông tin để có thể liên hệ bạn</h4>\n");
      out.write("                <div class=\"login-form\">\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"popup1\" class=\"overlay\">\n");
      out.write("            <div class=\"popup\">\n");
      out.write("                <h2>Thành Công</h2>\n");
      out.write("                <a onclick=\"closePopUp(this)\" class=\"close\" href=\"#\">&times;</a>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    Chúc Sức Khỏe.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("id");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("name");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("email");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("loginByGg");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.logbygg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent(null);
    _jspx_th_c_set_4.setVar("loginByFb");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.logbyfb}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginByGg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <form action=\"MainController\" method=\"POST\">\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <label class=\"label\">Họ Và Tên</label>\n");
        out.write("                                <input style=\"border-radius: 0\" name=\"accountName\" type=\"text\" class=\"input\" value=\"\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <label class=\"label\">Email</label>\n");
        out.write("                                <input style=\"border-radius: 0\" name=\"gmail\" type=\"text\" class=\"input\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" readonly>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <label class=\"label\">Số Điện Thoại</label>\n");
        out.write("                                <input style=\"border-radius: 0\" name=\"numberPhone\" type=\"text\" class=\"input\" value=\"\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <label class=\"label\">Giới Tính</label>\n");
        out.write("                                <input style=\"border-radius: 0\" name=\"numberPhone\" type=\"text\" class=\"input\" value=\"\">\n");
        out.write("                                <select id=\"gender\" class=\"form-select\" aria-label=\"Default select example\">\n");
        out.write("                                        <option value=\"male\">Nam</option>\n");
        out.write("                                        <option value=\"female\">Nữ</option>\n");
        out.write("                                </select>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <button style=\"background-color: #06A3DA; border-radius: 0;\" type=\"submit\" class=\"button\" name=\"action\" value=\"logbygg\">Tiếp tục</button>\n");
        out.write("                            </div>\n");
        out.write("                            <input name=\"idGoogle\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                        </form>\n");
        out.write("                    ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginByFb}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <form action=\"MainController\" method=\"POST\">\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <label class=\"label\">Họ Và Tên</label>\n");
        out.write("                                <input style=\"border-radius: 0\" name=\"accountName\" type=\"text\" class=\"input\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <label class=\"label\">Email</label>\n");
        out.write("                                <input style=\"border-radius: 0\" name=\"gmail\" type=\"text\" class=\"input\" value=\"\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <label class=\"label\">Số Điện Thoại</label>\n");
        out.write("                                <input style=\"border-radius: 0\" name=\"numberPhone\" type=\"text\" class=\"input\" value=\"\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"group\">\n");
        out.write("                                <button style=\"background-color: #06A3DA; border-radius: 0;\" type=\"submit\" class=\"button\" name=\"action\" value=\"logbyfb\">Tiếp tục</button>\n");
        out.write("                            </div>\n");
        out.write("                            <input name=\"idFacebook\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                        </form>                        \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
