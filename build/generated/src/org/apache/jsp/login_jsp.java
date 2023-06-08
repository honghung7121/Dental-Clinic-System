package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Icon Font Stylesheet -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"lib/twentytwenty/twentytwenty.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Login Stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
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
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow-sm px-5 py-3 py-lg-0\">\r\n");
      out.write("            <a href=\"index.html\" class=\"navbar-brand p-0\">\r\n");
      out.write("                <h1 class=\"m-0 text-primary\"><i class=\"fa fa-tooth me-2\"></i>DentCare</h1>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                <div class=\"navbar-nav ms-auto py-0\">\r\n");
      out.write("                    <a href=\"index.html\" class=\"nav-item nav-link\">Trang Chủ</a>\r\n");
      out.write("                    <a href=\"about.html\" class=\"nav-item nav-link active\">Về Chúng Tôi</a>\r\n");
      out.write("                    <a href=\"service.html\" class=\"nav-item nav-link\">Dịch Vụ</a>\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Khác</a>\r\n");
      out.write("                        <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                            <a href=\"price.html\" class=\"dropdown-item\">Pricing Plan</a>\r\n");
      out.write("                            <a href=\"team.html\" class=\"dropdown-item\">Our Dentist</a>\r\n");
      out.write("                            <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                            <a href=\"appointment.html\" class=\"dropdown-item\">Appointment</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"contact.html\" class=\"nav-item nav-link\">Liên Hệ</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\" class=\"btn text-dark\" data-bs-toggle=\"modal\" data-bs-target=\"#searchModal\"><i\r\n");
      out.write("                        class=\"fa fa-search\"></i></button>\r\n");
      out.write("                <a href=\"appointment.html\" class=\"btn btn-primary py-2 px-4 ms-3\">Đăng Ký Cuộc Hẹn</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"login-wrap\">\r\n");
      out.write("            <div class=\"login-html\">\r\n");
      out.write("                <input id=\"tab-1\" type=\"radio\" name=\"tab\" class=\"sign-in\" checked><label for=\"tab-1\" class=\"tab\">Đăng Nhập</label>\r\n");
      out.write("                <input id=\"tab-2\" type=\"radio\" name=\"tab\" class=\"sign-up\"><label for=\"tab-2\" class=\"tab\">Đăng Kí</label>\r\n");
      out.write("                <div class=\"login-form\">\r\n");
      out.write("                    <div class=\"sign-in-htm\">\r\n");
      out.write("                        <form action=\"MainController\" method=\"POST\">\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <label for=\"user\" class=\"label\">Email</label>\r\n");
      out.write("                                <input style=\"border-radius: 0\" id=\"user\" name=\"accountName\" type=\"text\" class=\"input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie.emailCookie.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <label for=\"pass\" class=\"label\">Mật Khẩu</label>\r\n");
      out.write("                                <input style=\"border-radius: 0\" id=\"pass\" name=\"password\" type=\"password\" class=\"input\" data-type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie.passwordCookie.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <input name=\"remember\" id=\"check\" type=\"checkbox\" class=\"check\" value=\"checked\">\r\n");
      out.write("                                <label for=\"check\"><span class=\"icon\"></span> Nhớ Mật Khẩu</label></br>\r\n");
      out.write("                                <small style=\"color: #00E77F; margin-top: .3rem; font-size: 1rem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SIGNUP_SUCCESSFULLY}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\r\n");
      out.write("                                <small style=\"color: red; margin-top: .3rem; font-size: 1rem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SIGNUP_FAIL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <button style=\"background-color: #06A3DA; border-radius: 0;\" type=\"submit\" class=\"button\" name=\"action\" value=\"Login\">Đăng Nhập</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"hr\"></div>\r\n");
      out.write("                        <div class=\"foot-lnk\">\r\n");
      out.write("                            <a href=\"forgotPassword.jsp\">Quên Mật Khẩu?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sign-up-htm\" >\r\n");
      out.write("                        <div class=\"group\" id=\"formFullName\">\r\n");
      out.write("                            <label for=\"user\" class=\"label\">Họ Và Tên</label>\r\n");
      out.write("                            <input style=\"border-radius: 0\" id=\"fullName\" name=\"fullName\" type=\"text\" class=\"input\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\" id=\"formEmail\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Địa Chỉ Email</label>\r\n");
      out.write("                            <input style=\"border-radius: 0\" id=\"email\" name=\"email\" type=\"text\" class=\"input\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\" id=\"formPhoneNumber\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Số Điện Thoại</label>\r\n");
      out.write("                            <input style=\"border-radius: 0\" id=\"phoneNumber\" name=\"phoneNumber\" type=\"text\" class=\"input\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\" id=\"formPassword\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Mật Khẩu</label>\r\n");
      out.write("                            <input style=\"border-radius: 0\" id=\"password1\" name=\"password\" type=\"password\" class=\"input\" data-type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Nhập Lại Mật Khẩu</label>\r\n");
      out.write("                            <input style=\"border-radius: 0\"  id=\"password2\" type=\"password\" class=\"input\" data-type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\" id=\"formSignUp\">\r\n");
      out.write("                            <input onclick=\"signup(this)\" style=\"background-color: #06A3DA; border-radius: 0;\" type=\"submit\" class=\"button\" value=\"Đăng Kí\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"foot-lnk\">\r\n");
      out.write("                            <label style=\"cursor: pointer;\" for=\"tab-1\">Bạn Đã Là Thành Viên?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"popup1\" class=\"overlay\">\r\n");
      out.write("            <div class=\"popup\">\r\n");
      out.write("                <h2>Thành Công</h2>\r\n");
      out.write("                <a onclick=\"closePopUp(this)\" class=\"close\" href=\"#\">&times;</a>\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    Chúc Sức Khỏe.\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                    function signup(btn) {\r\n");
      out.write("                        let name = document.getElementById('fullName');\r\n");
      out.write("                        let password1 = document.getElementById('password1');\r\n");
      out.write("                        let password2 = document.getElementById('password2');\r\n");
      out.write("                        let email = document.getElementById('email');\r\n");
      out.write("                        let phoneNumber = document.getElementById('phoneNumber');\r\n");
      out.write("                        let labels = Array.from(document.getElementsByClassName('errorMessage'));\r\n");
      out.write("                        labels.forEach(element => {\r\n");
      out.write("                            element.remove();\r\n");
      out.write("                        });\r\n");
      out.write("                        if (password1.value !== password2.value) {\r\n");
      out.write("                            let passwordForm = document.getElementById('formPassword');\r\n");
      out.write("                            passwordForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Mật Khẩu Không Trùng Nhau</label>';\r\n");
      out.write("                        } else if (!password1.value.match('[a-z]') || !password1.value.match('[A-Z]') || !password1.value.match('[0-9]') || password1.value.length < 7) {\r\n");
      out.write("                            let passwordForm = document.getElementById('formPassword');\r\n");
      out.write("                            passwordForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Mật khẩu phải dài hơn 7 kí tự phải chứ 1 ít nhất 1 kí tự HOA 1 số</label>';\r\n");
      out.write("                        } else if (name.value === '' || name.value.length < 5) {\r\n");
      out.write("                            let fullNameForm = document.getElementById('formFullName');\r\n");
      out.write("                            fullNameForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Họ và Tên không được để trống</label>';\r\n");
      out.write("                        } else if (email.value === '' || !email.value.includes('@gmail.com')) {\r\n");
      out.write("                            let emailForm = document.getElementById('formEmail');\r\n");
      out.write("                            emailForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Email không phù hợp</label>';\r\n");
      out.write("                        } else if (phoneNumber.value === '' || phoneNumber.value.length !== 10) {\r\n");
      out.write("                            let phoneNumberForm = document.getElementById('formPhoneNumber');\r\n");
      out.write("                            phoneNumberForm.innerHTML += '<label class=\"errorMessage\" style=\"color: red;\">Số điện thoại không phù hợp</label>';\r\n");
      out.write("                        } else {\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                                url: '/SWP391-SE1743/SignUpController',\r\n");
      out.write("                                data: {\r\n");
      out.write("                                    action: 'SignUp',\r\n");
      out.write("                                    fullName: name.value,\r\n");
      out.write("                                    password: password1.value,\r\n");
      out.write("                                    email: email.value,\r\n");
      out.write("                                    phoneNumber: phoneNumber.value\r\n");
      out.write("                                },\r\n");
      out.write("                                success: function (data) {\r\n");
      out.write("                                    if (data === 'success') {\r\n");
      out.write("                                        const div = document.querySelector('.overlay');\r\n");
      out.write("                                        div.classList.add('active');\r\n");
      out.write("                                    } else {\r\n");
      out.write("                                        let formSignUp = document.getElementById('formSignUp');\r\n");
      out.write("                                        formSignUp.innerHTML+='<label class=\"errorMessage\" style=\"color: red; margin-top:5px\">Email Đã Được Đăng Kí</label>';\r\n");
      out.write("                                    }\r\n");
      out.write("                                },\r\n");
      out.write("                                error: function (error) {\r\n");
      out.write("                                    console.log(\"Fail\");\r\n");
      out.write("                                },\r\n");
      out.write("                                type: 'POST'\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    function closePopUp() {\r\n");
      out.write("                        const div = document.querySelector('.overlay');\r\n");
      out.write("                        div.classList.remove('active');\r\n");
      out.write("                    }\r\n");
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
}
