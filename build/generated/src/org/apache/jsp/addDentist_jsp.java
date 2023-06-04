package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addDentist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- add-doctor24:06-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("                    <script src=\"assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("                    <script src=\"assets/js/respond.min.js\"></script>\r\n");
      out.write("            <![endif]-->\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("         ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div class=\"main-wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"page-wrapper\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\r\n");
      out.write("                            <h4 class=\"page-title\">Thêm Bác Sĩ</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\r\n");
      out.write("                            <form action=\"MainController\" method=\"get\"> \r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Họ và Tên <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" name=\"createNameDentist\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Email <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"email\" name=\"createEmailDentist\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Mật Khẩu</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" name=\"createPassDentist\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Nhập Lại Mật Khẩu</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" name=\"createPassAgainDentist\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <h6 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.report}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Số điện thoại (10 số)</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"number\" name=\"createPhoneDentist\" pattern=\"[0-9]{10}\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label>Ảnh Đại Diện</label>\r\n");
      out.write("                                            <div class=\"profile-upload\">\r\n");
      out.write("                                                <div class=\"upload-img\">\r\n");
      out.write("                                                    <img alt=\"\" src=\"assets/img/user.jpg\"  name=\"createImgDentist\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"upload-input\">\r\n");
      out.write("                                                    <input type=\"file\" class=\"form-control\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"gender\">Giới tính:</label>\r\n");
      out.write("                                        <select id=\"gender\" name=\"gender\">\r\n");
      out.write("                                          <option value=\"Nam\">Nam</option>\r\n");
      out.write("                                          <option value=\"Nữ\">Nữ</option>\r\n");
      out.write("                                          <option value=\"Khác\">Khác</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Kinh nghiệm</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" rows=\"3\" cols=\"30\" name=\"createExperienceDentist\" required=\"\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Bằng cấp</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" rows=\"3\" cols=\"30\" name=\"createDegreeDentist\" required=\"\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"display-block\">Trạng thái</label>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"createStatusDentist\" id=\"doctor_active\" value=\"1\" checked>\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"doctor_active\">\r\n");
      out.write("                                            Đẫ kích hoạt\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"createStatusDentist\" id=\"doctor_inactive\" value=\"0\">\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"doctor_inactive\">\r\n");
      out.write("                                            Chưa kích hoạt\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"m-t-20 text-center\">\r\n");
      out.write("                                    <button class=\"btn btn-primary submit-btn\" name=\"action\" value=\"createDentist\">Tạo bác sĩ</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                            function addDentist() {\r\n");
      out.write("                                let createNameDentist = document.getElementById('createNameDentist').value;\r\n");
      out.write("                                let createPassDentist = document.getElementById('createPassDentist').value;\r\n");
      out.write("                                let createPassAgainDentist = document.getElementById('createPassAgainDentist').value;\r\n");
      out.write("                                let createEmailDentist = document.getElementById('createEmailDentist').value;\r\n");
      out.write("                                let createPhoneDentist = document.getElementById('createPhoneDentist').value;\r\n");
      out.write("                                let createImageDentist = document.getElementById('createImageDentist').value;\r\n");
      out.write("                                let gender = document.getElementById('gender').value;\r\n");
      out.write("                                let createExperienceDentist = document.getElementById('createExperienceDentist').value;    \r\n");
      out.write("                                let createDegreeDentist = document.getElementById('createDegreeDentist').value;  \r\n");
      out.write("                                let createStatusDentist = document.getElementById('createStatusDentist').value;  \r\n");
      out.write("                                \r\n");
      out.write("                                if (createPassDentist !== createPassAgainDentist) {\r\n");
      out.write("                                    alert('Mật Khẩu Không Trùng Nhau');\r\n");
      out.write("                                }\r\n");
      out.write("                                else {\r\n");
      out.write("                                    $.ajax({\r\n");
      out.write("                                        url: '/SWP391-SE1743/MainController',\r\n");
      out.write("                                        data: {\r\n");
      out.write("                                            action: 'createDentist',\r\n");
      out.write("                                            createNameDentist: createNameDentist,\r\n");
      out.write("                                            createPassDentist: createPassDentist,\r\n");
      out.write("                                            createEmailDentist: createEmailDentist,\r\n");
      out.write("                                            createPhoneDentist: createPhoneDentist,\r\n");
      out.write("                                            createImageDentist: createImageDentist,\r\n");
      out.write("                                            gender: gender,\r\n");
      out.write("                                            createExperienceDentist: createExperienceDentist,\r\n");
      out.write("                                            createDegreeDentist: createDegreeDentist,\r\n");
      out.write("                                            createStatusDentist: createStatusDentist\r\n");
      out.write("                                        },\r\n");
      out.write("                                        success: function (data) {\r\n");
      out.write("                                            const div = document.querySelector('.overlay');\r\n");
      out.write("                                            div.classList.add('active');\r\n");
      out.write("                                        },\r\n");
      out.write("                                        error: function (error) {\r\n");
      out.write("                                            console(\"Fail\");\r\n");
      out.write("                                        },\r\n");
      out.write("                                        type: 'GET'\r\n");
      out.write("                                    });\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                            function closePopUp() {\r\n");
      out.write("                                const div = document.querySelector('.overlay');\r\n");
      out.write("                                div.classList.remove('active');\r\n");
      out.write("                            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- add-doctor24:06-->\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
}
