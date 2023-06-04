package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dservice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("            h1 {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-family: Tahoma, Arial, sans-serif;\r\n");
      out.write("                color: #06D85F;\r\n");
      out.write("                margin: 80px 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .box {\r\n");
      out.write("                width: 40%;\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("                background: rgba(255,255,255,0.2);\r\n");
      out.write("                padding: 35px;\r\n");
      out.write("                border: 2px solid #fff;\r\n");
      out.write("                border-radius: 20px/50px;\r\n");
      out.write("                background-clip: padding-box;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .button {\r\n");
      out.write("                font-size: 1em;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                border: 2px solid #06D85F;\r\n");
      out.write("                border-radius: 20px/50px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                transition: all 0.3s ease-out;\r\n");
      out.write("            }\r\n");
      out.write("            .button:hover {\r\n");
      out.write("                background: #06D85F;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .overlay {\r\n");
      out.write("                position: fixed;\r\n");
      out.write("                top: 0;\r\n");
      out.write("                bottom: 0;\r\n");
      out.write("                left: 0;\r\n");
      out.write("                right: 0;\r\n");
      out.write("                background: rgba(0, 0, 0, 0.7);\r\n");
      out.write("                transition: opacity 500ms;\r\n");
      out.write("                visibility: hidden;\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .overlay:target {\r\n");
      out.write("                visibility: visible;\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("            }\r\n");
      out.write("            .active{\r\n");
      out.write("                visibility: visible;\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("            }\r\n");
      out.write("            .popup {\r\n");
      out.write("                margin: 70px auto;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                width: 30%;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                transition: all 5s ease-in-out;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .popup h2 {\r\n");
      out.write("                margin-top: 0;\r\n");
      out.write("                color: #333;\r\n");
      out.write("                font-family: Tahoma, Arial, sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            .popup .close {\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: 20px;\r\n");
      out.write("                right: 30px;\r\n");
      out.write("                transition: all 200ms;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: #333;\r\n");
      out.write("            }\r\n");
      out.write("            .popup .close:hover {\r\n");
      out.write("                color: #06D85F;\r\n");
      out.write("            }\r\n");
      out.write("            .popup .content {\r\n");
      out.write("                max-height: 30%;\r\n");
      out.write("                overflow: auto;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media screen and (max-width: 700px){\r\n");
      out.write("                .box{\r\n");
      out.write("                    width: 70%;\r\n");
      out.write("                }\r\n");
      out.write("                .popup{\r\n");
      out.write("                    width: 70%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <div class=\"main-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"page-wrapper\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\r\n");
      out.write("                            <h4 class=\"page-title\">Thêm Dịch Vụ</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <div class=\"form-group\" id=\"formFullName\">\r\n");
      out.write("                                            <label>Tên dịch vụ <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" id=\"name\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <div class=\"form-group\" id=\"formEmail\">\r\n");
      out.write("                                            <label>Mô tả <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                            <textarea rows=\"7\" class=\"form-control\" type=\"text\"  name=\"mota\" id=\"mota\" required=\"\"></textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <div class=\"form-group\" id=\"formPhoneNumber\">\r\n");
      out.write("                                            <label>Giá tiền <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" id=\"price\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"display-block\">Status</label>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" id=\"status\" name=\"status\" id=\"product_active\" value=\"true\" checked>\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"product_active\">\r\n");
      out.write("                                            Active\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" id=\"status\" name=\"status\" id=\"product_inactive\" value=\"false\">\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"product_inactive\">\r\n");
      out.write("                                            Inactive\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"m-t-20 text-center\"> \r\n");
      out.write("                                    <a onclick=\"addService(this)\" class=\"btn btn-primary submit-btn\">Tạo</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"popup1\" class=\"overlay\">\r\n");
      out.write("                    <div class=\"popup\">\r\n");
      out.write("                        <h2>Thành Công</h2>\r\n");
      out.write("                        <a onclick=\"closePopUp(this)\" class=\"close\" href=\"#\">&times;</a>\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            Đã Thêm Mới Dịch Vụ Thành Công. Chúc Sức Khỏe.\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                            function addService() {\r\n");
      out.write("                                let name = document.getElementById('name').value;\r\n");
      out.write("                                let mota = document.getElementById('mota').value;\r\n");
      out.write("                                let price = document.getElementById('price').value;\r\n");
      out.write("                                let status = document.querySelector('input[name=status]:checked').value;\r\n");
      out.write("                                let labels = Array.from(document.getElementsByClassName('errorMessage'));\r\n");
      out.write("                                labels.forEach(element => {\r\n");
      out.write("                                    element.remove();\r\n");
      out.write("                                });\r\n");
      out.write("                                if (name === '' || name.length < 5) {\r\n");
      out.write("                                    let fullNameForm = document.getElementById('formFullName');\r\n");
      out.write("                                    fullNameForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Tên không được để trống</label>';\r\n");
      out.write("                                } else if (mota === '' || mota.length < 5) {\r\n");
      out.write("                                    let fullMoTaForm = document.getElementById('formEmail');\r\n");
      out.write("                                    fullMoTaForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Mô tả không được để trống</label>';\r\n");
      out.write("                                } else if (price === '') {\r\n");
      out.write("                                    let phoneNumberForm = document.getElementById('formPhoneNumber');\r\n");
      out.write("                                    phoneNumberForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Giá tiền không được để trống</label>';\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    $.ajax({\r\n");
      out.write("                                        url: '/SWP391-SE1743/MainController',\r\n");
      out.write("                                        data: {\r\n");
      out.write("                                            action: 'AddService',\r\n");
      out.write("                                            name: name,\r\n");
      out.write("                                            mota: mota,\r\n");
      out.write("                                            price: price,\r\n");
      out.write("                                            status: status\r\n");
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
}
