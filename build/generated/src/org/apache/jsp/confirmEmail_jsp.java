package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- forgot-password24:03-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("                    <script src=\"assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("                    <script src=\"assets/js/respond.min.js\"></script>\r\n");
      out.write("            <![endif]-->\r\n");
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
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main-wrapper account-wrapper\">\r\n");
      out.write("            <div class=\"account-page\">\r\n");
      out.write("                <div class=\"account-center\">\r\n");
      out.write("                    <div class=\"account-box\">\r\n");
      out.write("                        <form>\r\n");
      out.write("                            <div class=\"account-logo\">\r\n");
      out.write("                                <a href=\"https://accounts.google.com/v3/signin/identifier?dsh=S-972331380%3A1685858268955187&ffgf=1&ifkv=Af_xneFEUhmDNwyUiNTGfIQP16MFBBaZZBtytQejB_6eBSoYZf0ZMwwksPC80SNo6F-hA5GoHlBJvg&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin\" target=\"_blank\"><img src=\"assets/img/gmail.png\" ></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\" id=\"formCode\">\r\n");
      out.write("                                <label>Nhập Mã Xác Nhận Của Bạn <span class=\"text-danger\">*</span></label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"maxacnhan\" id=\"name\" required=\"\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\" id=\"formCode\" style=\"display: none;\">\r\n");
      out.write("                                <label>Nhập Mã Xác Nhận Của Bạn</label>\r\n");
      out.write("                                <input class=\"form-control\" id=\"code\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\" required=\"\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\" id=\"formPassword\">\r\n");
      out.write("                                <label>Nhập Mật Khẩu Mới</label>\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"password1\" name=\"pass1\" required=\"\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\" id=\"formPassword\">\r\n");
      out.write("                                <label>Nhập Lại Mật Khẩu</label>\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"password2\" name=\"pass2\" required=\"\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h6 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.report}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group text-center\"> \r\n");
      out.write("                                <a onclick=\"forgotPass(this)\" class=\"btn btn-primary submit-btn\">Xác nhận Mã</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-center register-link\">\r\n");
      out.write("                                <a href=\"login.jsp\">Quay về đăng nhập</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                    function forgotPass() {\r\n");
      out.write("                        let c1 = document.getElementById('name').value;\r\n");
      out.write("                        let c2 = document.getElementById('code').value;\r\n");
      out.write("                        let p1 = document.getElementById('password1').value;\r\n");
      out.write("                        let p2 = document.getElementById('password2').value;\r\n");
      out.write("                        let labels = Array.from(document.getElementsByClassName('errorMessage'));\r\n");
      out.write("                        labels.forEach(element => {\r\n");
      out.write("                            element.remove();\r\n");
      out.write("                        });\r\n");
      out.write("                        if (c1 !== c2) {\r\n");
      out.write("                            let fullCodeForm = document.getElementById('formCode');\r\n");
      out.write("                            fullCodeForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Mã xác nhận không đúng </label>';\r\n");
      out.write("                        } else if (p1 !== p2) {\r\n");
      out.write("                            let fullPassForm = document.getElementById('formPassword');\r\n");
      out.write("                            fullPassForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Mật khẩu không trùng nhau </label>';\r\n");
      out.write("                        } else {\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                                url: '/SWP391-SE1743/MainController',\r\n");
      out.write("                                data: {\r\n");
      out.write("                                    action: 'codeMail',\r\n");
      out.write("                                    pass: p1\r\n");
      out.write("                                },\r\n");
      out.write("                                success: function (data) {\r\n");
      out.write("                                    window.location.href = \"login.jsp\";\r\n");
      out.write("                                },\r\n");
      out.write("                                error: function (error) {\r\n");
      out.write("                                    console(\"Fail\");\r\n");
      out.write("                                },\r\n");
      out.write("                                type: 'GET'\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
}
