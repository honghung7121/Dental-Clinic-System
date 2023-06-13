package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class invoiceView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"main-wrapper\">\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-5 col-4\">\n");
      out.write("                            <h4 class=\"page-title\">Hoá Đơn</h4>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"row custom-invoice\">\n");
      out.write("                                        <div class=\"col-6 col-sm-6 m-b-20\">\n");
      out.write("                                            <img src=\"assets/img/logo.png\" class=\"inv-logo\" alt=\"\">\n");
      out.write("                                            <ul class=\"list-unstyled\">\n");
      out.write("                                                <h1 class=\"m-0 text-primary\"><i class=\"fa fa-tooth me-2\"></i>DentCare</h1>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-6 col-sm-6 m-b-20\">\n");
      out.write("                                            <div class=\"invoice-details\">\n");
      out.write("                                                <h3 class=\"text-uppercase\">Hoá Đơn #ID-01</h3>\n");
      out.write("                                                <ul class=\"list-unstyled\">\n");
      out.write("                                                    <li>Ngày Trả: <span>13/6/2023</span></li>\n");
      out.write("                                                    <li>Hạn Trả: <span>16/6/2023</span></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--                                    <div class=\"row\">\n");
      out.write("                                                                            <div class=\"col-sm-6 col-lg-6 m-b-20\">\n");
      out.write("                                    \n");
      out.write("                                                                                <h5>Hoá Đơn:</h5>\n");
      out.write("                                                                                <ul class=\"list-unstyled\">\n");
      out.write("                                                                                    <li>\n");
      out.write("                                                                                        <h5><strong>Barry Cuda</strong></h5>\n");
      out.write("                                                                                    </li>\n");
      out.write("                                                                                    <li><span>Global Technologies</span></li>\n");
      out.write("                                                                                    <li>5754 Airport Rd</li>\n");
      out.write("                                                                                    <li>Coosada, AL, 36020</li>\n");
      out.write("                                                                                    <li>United States</li>\n");
      out.write("                                                                                    <li>888-777-6655</li>\n");
      out.write("                                                                                    <li><a href=\"#\">barrycuda@example.com</a></li>\n");
      out.write("                                                                                </ul>\n");
      out.write("                                    \n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"col-sm-6 col-lg-6 m-b-20\">\n");
      out.write("                                                                                <div class=\"invoices-view\">\n");
      out.write("                                                                                    <span class=\"text-muted\">Payment Details:</span>\n");
      out.write("                                                                                    <ul class=\"list-unstyled invoice-payment-details\">\n");
      out.write("                                                                                        <li>\n");
      out.write("                                                                                            <h5>Total Due: <span class=\"text-right\">$288.2</span></h5>\n");
      out.write("                                                                                        </li>\n");
      out.write("                                                                                        <li>Bank name: <span>Profit Bank Europe</span></li>\n");
      out.write("                                                                                        <li>Country: <span>United Kingdom</span></li>\n");
      out.write("                                                                                        <li>City: <span>London E1 8BF</span></li>\n");
      out.write("                                                                                        <li>Address: <span>3 Goodman Street</span></li>\n");
      out.write("                                                                                        <li>IBAN: <span>KFH37784028476740</span></li>\n");
      out.write("                                                                                        <li>SWIFT code: <span>BPT4E</span></li>\n");
      out.write("                                                                                    </ul>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>-->\n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table table-striped table-hover\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>STT</th>\n");
      out.write("                                                    <th>Dịch Vụ</th>\n");
      out.write("                                                    <th>Mô Tả</th>\n");
      out.write("                                                    <th>Giá Tiền</th>\n");
      out.write("                                                    <th>Số Lượng</th>\n");
      out.write("                                                    <th>Tổng Tiền</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>1</td>\n");
      out.write("                                                    <td>Lấy Tuỷ</td>\n");
      out.write("                                                    <td>Răng hỏng tuỷ nặng cần lấy sạch tuỷ</td>\n");
      out.write("                                                    <td>200.000đ</td>\n");
      out.write("                                                    <td>1</td>\n");
      out.write("                                                    <td>200.000đ</td>\n");
      out.write("                                                </tr>\n");
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"row invoice-payment\">\n");
      out.write("                                            <div class=\"col-sm-7\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-5\">\n");
      out.write("                                                <div class=\"m-b-20\">\n");
      out.write("                                                    <h6>Tổng Tiền</h6>\n");
      out.write("                                                    <div class=\"table-responsive no-border\">\n");
      out.write("                                                        <table class=\"table mb-0\">\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th>Thanh Toán</th>\n");
      out.write("                                                                    <td class=\"text-right text-primary\">\n");
      out.write("                                                                        <h5>200.000đ</h5>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                   \n");
      out.write("                                                                    \n");
      out.write("                                                                </tr>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th>QR Thanh Toán</th>\n");
      out.write("                                                                    <td class=\"text-right text-primary\">\n");
      out.write("                                                                         <img src=\"assets/img/QR.jpg\"  alt=\"\">\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                   \n");
      out.write("                                                                    \n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </tbody>\n");
      out.write("\n");
      out.write("                                                        </table>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"invoice-info\">\n");
      out.write("                                            <h5>Lời Dặn Của Bác Sĩ</h5>\n");
      out.write("                                            <p class=\"text-muted\"> -Hạn chế ăn đồ ăn cứng và phải vệ sinh răng miệng thường xuyên.</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-overlay\" data-reff=\"\"></div>\n");
      out.write("        <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.slimscroll.js\"></script>\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
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
