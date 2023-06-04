package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"main-wrapper account-wrapper\">\n");
      out.write("                <div class=\"account-page\">\n");
      out.write("                    <div class=\"account-center\">\n");
      out.write("                        <div class=\"account-box\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"account-logo\">\n");
      out.write("                                    <a href=\"https://accounts.google.com/v3/signin/identifier?dsh=S-972331380%3A1685858268955187&ffgf=1&ifkv=Af_xneFEUhmDNwyUiNTGfIQP16MFBBaZZBtytQejB_6eBSoYZf0ZMwwksPC80SNo6F-hA5GoHlBJvg&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin\" target=\"_blank\"><img src=\"assets/img/gmail.png\" ></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\" id=\"formCode\">\n");
      out.write("                                    <label>Nhập Mã Xác Nhận Của Bạn</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"code1\"  required=\"\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Nhập Mã Xác Nhận Của Bạn</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"code2\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\" required=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\" id=\"formPassword\">\n");
      out.write("                                <label>Nhập Mật Khẩu Mới</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"password1\" name=\"pass1\" required=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\" >\n");
      out.write("                                <label>Nhập Lại Mật Khẩu</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"password2\" name=\"pass2\" required=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                            <h6 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.report}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\n");
      out.write("                            <div class=\"form-group text-center\">\n");
      out.write("                                <!--                                <a onclick=\"password(this)\" class=\"btn btn-primary account-btn\">Xác nhận Mã</a>-->\n");
      out.write("                                <button class=\"btn btn-primary account-btn\" type=\"submit\" name=\"action\" value=\"codeMail\">Xác nhận Mã</button>\n");
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
      out.write("        <!--        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\n");
      out.write("                <script>\n");
      out.write("                                            function password() {\n");
      out.write("                                                let code1 = document.getElementById('code1').value;\n");
      out.write("                                                let code2 = document.getElementById('code2').value;\n");
      out.write("                                                let password1 = document.getElementById('password1').value;\n");
      out.write("                                                let password2 = document.getElementById('password2').value;\n");
      out.write("                                                let labels = Array.from(document.getElementsByClassName('errorMessage'));\n");
      out.write("                                                labels.forEach(element => {\n");
      out.write("                                                    element.remove();\n");
      out.write("                                                });\n");
      out.write("                                                if (code1.value !== code2.value) {\n");
      out.write("                                                    let codeForm = document.getElementById('formCode');\n");
      out.write("                                                    codeForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Ma Không Trùng Nhau</label>';\n");
      out.write("                                                } else if (!password1.value.match('[0-9]') || password1.value.length !== 4) {\n");
      out.write("                                                    let codeForm = document.getElementById('formCode');\n");
      out.write("                                                    codeForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">ma phải bang 4 </label>';\n");
      out.write("                                                } else if (password1.value !== password2.value) {\n");
      out.write("                                                    let passwordForm = document.getElementById('formPassword');\n");
      out.write("                                                    passwordForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Mật Khẩu Không Trùng Nhau</label>';\n");
      out.write("                                                } else if (!password1.value.match('[a-z]') || !password1.value.match('[A-Z]') || !password1.value.match('[0-9]') || password1.value.length < 7) {\n");
      out.write("                                                    let passwordForm = document.getElementById('formPassword');\n");
      out.write("                                                    passwordForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Mật khẩu phải dài hơn 7 kí tự phải chứ 1 ít nhất 1 kí tự HOA 1 số</label>';\n");
      out.write("                                                } else {\n");
      out.write("                                                    $.ajax({\n");
      out.write("                                                        url: '/SWP391-SE1743/MainController',\n");
      out.write("                                                        data: {\n");
      out.write("                                                            action: 'codeMail',\n");
      out.write("                                                            code: code1,\n");
      out.write("                                                            password: password1,\n");
      out.write("                                                        },\n");
      out.write("                                                        success: function (data) {\n");
      out.write("                                                            div.classList.add('active');\n");
      out.write("                                                            \n");
      out.write("                                                        },\n");
      out.write("                                                        error: function (error) {\n");
      out.write("                                                            console.log(\"Fail\");\n");
      out.write("                                                        },\n");
      out.write("                                                        type: 'POST'\n");
      out.write("                                                    });\n");
      out.write("                                                }\n");
      out.write("                                            }\n");
      out.write("        \n");
      out.write("                </script>-->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
    _jspx_th_c_set_0.setVar("code");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
