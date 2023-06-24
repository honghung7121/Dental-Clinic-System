package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAL.ServiceDAO;
import Models.Service;

public final class serviceUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>DentCare - Dental Clinic Website Template</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/dataTables.bootstrap4.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <style>      \r\n");
      out.write("            .btnLink{\r\n");
      out.write("                background: none;\r\n");
      out.write("                border: none;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                color: #009ce7;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerUser.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"modal fade\" id=\"searchModal\" tabindex=\"-1\">\r\n");
      out.write("                <div class=\"modal-dialog modal-fullscreen\">\r\n");
      out.write("                    <div class=\"modal-content\" style=\"background: rgba(9, 30, 62, .7);\">\r\n");
      out.write("                        <div class=\"modal-header border-0\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn bg-white btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body d-flex align-items-center justify-content-center\">\r\n");
      out.write("                            <div class=\"input-group\" style=\"max-width: 600px;\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control bg-transparent border-primary p-3\" placeholder=\"Type search keyword\">\r\n");
      out.write("                                <button class=\"btn btn-primary px-4\"><i class=\"bi bi-search\"></i></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Full Screen Search End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Hero Start -->\r\n");
      out.write("            <div class=\"container-fluid bg-primary py-5 hero-header mb-5\">\r\n");
      out.write("                <div class=\"row py-3\">\r\n");
      out.write("                    <div class=\"col-12 text-center\">\r\n");
      out.write("                        <h1 class=\"display-3 text-white animated zoomIn\">Dịch vụ</h1>\r\n");
      out.write("                        <a href=\"\" class=\"h4 text-white\">Trang chủ</a>\r\n");
      out.write("                        <i class=\"far fa-circle text-white px-2\"></i>\r\n");
      out.write("                        <a href=\"\" class=\"h4 text-white\">Dịch vụ</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Hero End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Service Start -->\r\n");
      out.write("            <div class=\"container-fluid py-5 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row g-5 mb-5\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <div class=\"section-title mb-5\">\r\n");
      out.write("                                <h5 class=\"position-relative d-inline-block text-primary text-uppercase\">Dịch vụ của chúng tôi</h5>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Service End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Full Screen Create Start -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Full Screen Create End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Newsletter Start -->\r\n");
      out.write("            <div class=\"container-fluid position-relative pt-5 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"z-index: 1;\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"bg-primary p-5\">\r\n");
      out.write("                        <form class=\"mx-auto\" style=\"max-width: 600px;\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control border-white p-3\" placeholder=\"Email của bạn\">\r\n");
      out.write("                                <button class=\"btn btn-dark px-4\">Đăng ký</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Newsletter End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Back to Top -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square rounded back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- JavaScript Libraries -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/wow/wow.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/twentytwenty/jquery.event.move.js\"></script>\r\n");
      out.write("        <script src=\"lib/twentytwenty/jquery.twentytwenty.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Javascript -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.slimscroll.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/Chart.bundle.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/chart.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/title_sort.js\"></script>                        \r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/select2.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function searchByName(text) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: '/SWP391-SE1743/MainController',\r\n");
      out.write("                    data: {\r\n");
      out.write("                        action: 'Search Service User By Name',\r\n");
      out.write("                        name: text.value\r\n");
      out.write("                    },\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        let row = document.getElementById(\"content\");\r\n");
      out.write("                        row.innerHTML = data;\r\n");
      out.write("                    },\r\n");
      out.write("                    error: function (error) {\r\n");
      out.write("                        console(\"Fail\");\r\n");
      out.write("                    },\r\n");
      out.write("                    type: 'GET'\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
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
