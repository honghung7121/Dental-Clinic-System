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
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Jost:wght@500;600;700&family=Open+Sans:wght@400;600&display=swap\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
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
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("         <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User.getRoleID() != 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><c:redirect url=\"login.jsp\"/></c:if>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow-sm px-5 py-3 py-lg-0\">\r\n");
      out.write("            <a href=\"index.html\" class=\"navbar-brand p-0\">\r\n");
      out.write("                <h1 class=\"m-0 text-primary\"><i class=\"fa fa-tooth me-2\"></i>DentCare</h1>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                <div class=\"navbar-nav ms-auto py-0\">\r\n");
      out.write("                    <a href=\"index.html\" class=\"nav-item nav-link\">Home</a>\r\n");
      out.write("                    <a href=\"about.html\" class=\"nav-item nav-link active\">About</a>\r\n");
      out.write("                    <a href=\"service.html\" class=\"nav-item nav-link\">Service</a>\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                        <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                            <a href=\"price.html\" class=\"dropdown-item\">Pricing Plan</a>\r\n");
      out.write("                            <a href=\"team.html\" class=\"dropdown-item\">Our Dentist</a>\r\n");
      out.write("                            <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                            <a href=\"appointment.html\" class=\"dropdown-item\">Appointment</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"contact.html\" class=\"nav-item nav-link\">Contact</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\" class=\"btn text-dark\" data-bs-toggle=\"modal\" data-bs-target=\"#searchModal\"><i\r\n");
      out.write("                        class=\"fa fa-search\"></i></button>\r\n");
      out.write("                <a href=\"appointment.html\" class=\"btn btn-primary py-2 px-4 ms-3\">Appointment</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"login-wrap\">\r\n");
      out.write("            <div class=\"login-html\">\r\n");
      out.write("                <input id=\"tab-1\" type=\"radio\" name=\"tab\" class=\"sign-in\" checked><label for=\"tab-1\" class=\"tab\">Sign In</label>\r\n");
      out.write("                <input id=\"tab-2\" type=\"radio\" name=\"tab\" class=\"sign-up\"><label for=\"tab-2\" class=\"tab\">Sign Up</label>\r\n");
      out.write("                <div class=\"login-form\">\r\n");
      out.write("                    <div class=\"sign-in-htm\">\r\n");
      out.write("                        <form action=\"MainController\" method=\"POST\">\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <label for=\"user\" class=\"label\">Username</label>\r\n");
      out.write("                                <input id=\"user\" name=\"accountName\" type=\"text\" class=\"input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <label for=\"pass\" class=\"label\">Password</label>\r\n");
      out.write("                                <input id=\"pass\" name=\"password\" type=\"password\" class=\"input\" data-type=\"password\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <input id=\"check\" type=\"checkbox\" class=\"check\" checked>\r\n");
      out.write("                                <label for=\"check\"><span class=\"icon\"></span> Keep me Signed in</label></br>\r\n");
      out.write("                                <small style=\"color: #00E77F; margin-top: .3rem; font-size: 1rem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SIGNUP_SUCCESSFULLY}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\r\n");
      out.write("                                <small style=\"color: red; margin-top: .3rem; font-size: 1rem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SIGNUP_FAIL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"group\">\r\n");
      out.write("                                <input style=\"background-color: #06A3DA;\" type=\"submit\" class=\"button\" name=\"action\" value=\"Login\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"hr\"></div>\r\n");
      out.write("                        <div class=\"foot-lnk\">\r\n");
      out.write("                            <a href=\"forgotPassword.jsp\">Forgot Password?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sign-up-htm\">\r\n");
      out.write("                        <div class=\"group\">\r\n");
      out.write("                            <label for=\"user\" class=\"label\">Full Name</label>\r\n");
      out.write("                            <input id=\"user\" type=\"text\" class=\"input\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Email Address</label>\r\n");
      out.write("                            <input id=\"pass\" type=\"text\" class=\"input\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Phone Number</label>\r\n");
      out.write("                            <input id=\"pass\" type=\"text\" class=\"input\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Password</label>\r\n");
      out.write("                            <input id=\"pass\" type=\"password\" class=\"input\" data-type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\">\r\n");
      out.write("                            <label for=\"pass\" class=\"label\">Repeat Password</label>\r\n");
      out.write("                            <input id=\"pass\" type=\"password\" class=\"input\" data-type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"group\">\r\n");
      out.write("                            <input style=\"background-color: #06A3DA;\" type=\"submit\" class=\"button\" value=\"Sign Up\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"foot-lnk\">\r\n");
      out.write("                            <label style=\"cursor: pointer;\" for=\"tab-1\">Already Member?</a>\r\n");
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
}
