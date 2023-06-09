package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link\n");
      out.write("        href=\"https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerUser.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"searchModal\" tabindex=\"-1\">\n");
      out.write("        <div class=\"modal-dialog modal-fullscreen\">\n");
      out.write("            <div class=\"modal-content\" style=\"background: rgba(9, 30, 62, .7);\">\n");
      out.write("                <div class=\"modal-header border-0\">\n");
      out.write("                    <button type=\"button\" class=\"btn bg-white btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body d-flex align-items-center justify-content-center\">\n");
      out.write("                    <div class=\"input-group\" style=\"max-width: 600px;\">\n");
      out.write("                        <input type=\"text\" class=\"form-control bg-transparent border-primary p-3\" placeholder=\"Type search keyword\">\n");
      out.write("                        <button class=\"btn btn-primary px-4\"><i class=\"bi bi-search\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Full Screen Search End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Hero Start -->\n");
      out.write("    <div class=\"container-fluid bg-primary py-5 hero-header mb-5\">\n");
      out.write("        <div class=\"row py-3\">\n");
      out.write("            <div class=\"col-12 text-center\">\n");
      out.write("                <h1 class=\"display-3 text-white animated zoomIn\">Về Chúng Tôi</h1>\n");
      out.write("                <a href=\"\" class=\"h4 text-white\">Trang Chủ</a>\n");
      out.write("                <i class=\"far fa-circle text-white px-2\"></i>\n");
      out.write("                <a href=\"\" class=\"h4 text-white\">Thông Tin</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Hero End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- About Start -->\n");
      out.write("    <div class=\"container-fluid py-5 wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row g-5\">\n");
      out.write("                <div class=\"col-lg-7\">\n");
      out.write("                    <div class=\"section-title mb-4\">\n");
      out.write("                        <h5 class=\"position-relative d-inline-block text-primary text-uppercase\">Về Chúng Tôi</h5>\n");
      out.write("                        <h1 class=\"display-5 mb-0\">Phòng khám nha khoa tốt nhất thế giới mà bạn có thể tin tưởng</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <h4 class=\"text-body fst-italic mb-4\">Nha sĩ luôn rất thân thiện, chu đáo và tận tình giải đáp mọi thắc mắc của khách hàng.</h4>\n");
      out.write("                    <p class=\"mb-4\">Khách hàng sẽ cảm thấy rất yên tâm và tin tưởng khi được điều trị tại phòng khám của chúng tôi. Các thiết bị và trang thiết bị y tế tại đây cũng được cập nhật và tiên tiến, giúp cho quá trình điều trị của khách hàng diễn ra thuận lợi và hiệu quả hơn.</p>\n");
      out.write("                    <div class=\"row g-3\">\n");
      out.write("                        <div class=\"col-sm-6 wow zoomIn\" data-wow-delay=\"0.3s\">\n");
      out.write("                            <h5 class=\"mb-3\"><i class=\"fa fa-check-circle text-primary me-3\"></i>Giành nhiều giải thưởng</h5>\n");
      out.write("                            <h5 class=\"mb-3\"><i class=\"fa fa-check-circle text-primary me-3\"></i>Đội ngũ nhân viên chuyên nghiệp</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 wow zoomIn\" data-wow-delay=\"0.6s\">\n");
      out.write("                            <h5 class=\"mb-3\"><i class=\"fa fa-check-circle text-primary me-3\"></i>Mở cửa 24/7</h5>\n");
      out.write("                            <h5 class=\"mb-3\"><i class=\"fa fa-check-circle text-primary me-3\"></i>Giá cả hợp lý</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"appointment.html\" class=\"btn btn-primary py-3 px-5 mt-4 wow zoomIn\" data-wow-delay=\"0.6s\">Đặt lịch hẹn</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5\" style=\"min-height: 500px;\">\n");
      out.write("                    <div class=\"position-relative h-100\">\n");
      out.write("                        <img class=\"position-absolute w-100 h-100 rounded wow zoomIn\" data-wow-delay=\"0.9s\" src=\"img/about.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- About End -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Newsletter Start -->\n");
      out.write("    <div class=\"container-fluid position-relative pt-5 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"z-index: 1;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"bg-primary p-5\">\n");
      out.write("                <form class=\"mx-auto\" style=\"max-width: 600px;\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control border-white p-3\" placeholder=\"Your Email\">\n");
      out.write("                        <button class=\"btn btn-dark px-4\">Đăng ký</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Newsletter End -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
}
