package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dentistappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        .button-4 {\r\n");
      out.write("            appearance: none;\r\n");
      out.write("            background-color: #FAFBFC;\r\n");
      out.write("            border: 1px solid rgba(27, 31, 35, 0.15);\r\n");
      out.write("            border-radius: 6px;\r\n");
      out.write("            box-shadow: rgba(27, 31, 35, 0.04) 0 1px 0, rgba(255, 255, 255, 0.25) 0 1px 0 inset;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            color: #24292E;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            font-family: -apple-system, system-ui, \"Segoe UI\", Helvetica, Arial, sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\";\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("            line-height: 20px;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            padding: 6px 16px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            transition: background-color 0.2s cubic-bezier(0.3, 0, 0.5, 1);\r\n");
      out.write("            user-select: none;\r\n");
      out.write("            -webkit-user-select: none;\r\n");
      out.write("            touch-action: manipulation;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("            word-wrap: break-word;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-4:hover {\r\n");
      out.write("            background-color: #F3F4F6;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            transition-duration: 0.1s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-4:disabled {\r\n");
      out.write("            background-color: #FAFBFC;\r\n");
      out.write("            border-color: rgba(27, 31, 35, 0.15);\r\n");
      out.write("            color: #959DA5;\r\n");
      out.write("            cursor: default;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-4:active {\r\n");
      out.write("            background-color: #EDEFF2;\r\n");
      out.write("            box-shadow: rgba(225, 228, 232, 0.2) 0 1px 0 inset;\r\n");
      out.write("            transition: none 0s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-4:focus {\r\n");
      out.write("            outline: 1px transparent;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-4:before {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-4:-webkit-details-marker {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        .btnLink{\r\n");
      out.write("            background: none;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            color: #009ce7;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        :root {\r\n");
      out.write("            --green: #009ce7;\r\n");
      out.write("            --white: #fff;\r\n");
      out.write("            --light-white: #aaa;\r\n");
      out.write("            --black: #3d3d3d;\r\n");
      out.write("            --light-bg: #4b4b4b;\r\n");
      out.write("            --box-shadow: .5rem .5rem 0 rgba(22, 160, 100, .2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .btn {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            background-color: var(--light-bg);\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            color: var(--white);\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("            padding: .5rem 1.2rem;\r\n");
      out.write("            border: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            transition: .2s;\r\n");
      out.write("            background-color: var(--white);\r\n");
      out.write("            color: var(--black);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .top {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            margin: 1rem 0;\r\n");
      out.write("            gap: 1rem\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .top h2 {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .top a{\r\n");
      out.write("            background-color: var(--white);\r\n");
      out.write("            color: var(--black);\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("            padding: .2rem;\r\n");
      out.write("            transition: .5s;\r\n");
      out.write("        }\r\n");
      out.write("        .top a:hover{\r\n");
      out.write("            transform: translateY(-5px);\r\n");
      out.write("        }\r\n");
      out.write("        .main-title {\r\n");
      out.write("            display: grid;\r\n");
      out.write("        }\r\n");
      out.write("        .items{\r\n");
      out.write("            margin-top: 1rem;\r\n");
      out.write("        }\r\n");
      out.write("        .items-info img {\r\n");
      out.write("            width: 130px;\r\n");
      out.write("            height: 130px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .items-info {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            gap: 1rem;\r\n");
      out.write("            padding-bottom: .8rem;\r\n");
      out.write("            border-bottom: solid .1rem #009ce7;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .items-info h3 {\r\n");
      out.write("            font-size: 1.4rem;\r\n");
      out.write("            color: var(--green);\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .items-info h3 span {\r\n");
      out.write("            font-size: 1.3rem;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .items-info small {\r\n");
      out.write("            color: #9e9ea4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .items-info h2 {\r\n");
      out.write("            color: tan;\r\n");
      out.write("            margin: .3rem;\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"page-wrapper\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-4 col-3\">\r\n");
      out.write("                            <h4 class=\"page-title\">Lịch Hẹn</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-8 col-9 text-right m-b-20\">\r\n");
      out.write("                            <a href=\"addEmployee.jsp\" class=\"btn btn-primary float-right btn-rounded\"><i class=\"fa fa-plus\"></i> Thêm Nhân Viên</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" course\" class=\"items\">\r\n");
      out.write("                    <div class=\"items-info\">\r\n");
      out.write("                        <div class=\"items-details\">\r\n");
      out.write("                            <h3 style=\"text-align: left; color: #009ce7; margin-bottom: 10px\" class=\"teachers-name\">P16<span style=\"color: black\">-Trần Hồng Hưng</span></h3>\r\n");
      out.write("                            <span style=\"color: black\">Mô Tả:</span><data class=\"teachers-subject\">đau răng gì mà nó đau quá trời quá đất luôn á mấy má.</data>\r\n");
      out.write("                            <div style=\"margin-bottom: 10px\"></div>\r\n");
      out.write("                            <div class=\"price\" style=\"margin-bottom: 10px\">\r\n");
      out.write("                                <span style=\"color: black\">Thời Gian:</span><h2 style=\"display: inline\">12:40</h2>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button class=\"button-4 completed-advisory\" role=\"button\">Hoàn Thành</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" course\" class=\"items\">\r\n");
      out.write("                    <div class=\"items-info\">\r\n");
      out.write("                        <div class=\"items-details\">\r\n");
      out.write("                            <h3 style=\"text-align: left; color: #009ce7; margin-bottom: 10px\" class=\"teachers-name\">P17<span style=\"color: black\">-Lê Hòa Bình</span></h3>\r\n");
      out.write("                            <span style=\"color: black\">Mô Tả:</span><data class=\"teachers-subject\">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Accusamus quasi dolores minima reprehenderit illo vero repudiandae. Hic, facilis, in facere aliquid nesciunt obcaecati est, neque culpa recusandae repudiandae eius iure.</data>\r\n");
      out.write("                            <div style=\"margin-bottom: 10px\"></div>\r\n");
      out.write("                            <div class=\"price\" style=\"margin-bottom: 10px\">\r\n");
      out.write("                                <span style=\"color: black\">Thời Gian:</span><h2 style=\"display: inline\">12:40</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button class=\"button-4 completed-advisory\" role=\"button\">Hoàn Thành</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
