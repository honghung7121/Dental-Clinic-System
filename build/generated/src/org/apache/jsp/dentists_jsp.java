package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dentists_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("    <!-- doctors23:12-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@100;300;400;500;800&family=Poppins:wght@400;500;600;700&display=swap\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <div class=\"main-wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"page-wrapper\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-4 col-3\">\r\n");
      out.write("                                <h4 class=\"page-title\">Quản Lý Bác Sĩ</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-8 col-9 text-right m-b-20\">\r\n");
      out.write("                                <a href=\"addDentist.jsp\" class=\"btn btn-primary btn-rounded float-right\"><i class=\"fa fa-plus\"></i> Thêm Bác Sĩ</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"showDentist\" class=\"row doctor-grid\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("     \r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <div class=\"see-all\">\r\n");
      out.write("                            <button class=\"see-all-btn\" onclick=\"loadMoreDentist()\">Xem Thêm</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>          \r\n");
      out.write("            <script>\r\n");
      out.write("                                function loadMoreDentist() {\r\n");
      out.write("                                    var amount = document.getElementsByClassName(\"dentistProduct\").length;\r\n");
      out.write("                                    $.ajax({\r\n");
      out.write("                                        url: \"/SWP391-SE1743/LoadMoreDentistController\",\r\n");
      out.write("                                        type: \"get\", //send it through get method\r\n");
      out.write("                                        data: {\r\n");
      out.write("                                            exits: amount\r\n");
      out.write("                                        },\r\n");
      out.write("                                        success: function (data) {\r\n");
      out.write("                                            var row = document.getElementById(\"showDentist\");\r\n");
      out.write("                                            row.innerHTML += data;\r\n");
      out.write("                                        },\r\n");
      out.write("                                        error: function (xhr) {\r\n");
      out.write("                                            //Do Something to handle error\r\n");
      out.write("                                        }\r\n");
      out.write("                                    });\r\n");
      out.write("                                }\r\n");
      out.write("            </script>\r\n");
      out.write("            <script>\r\n");
      out.write("                // Lắng nghe sự kiện click của nút \"Delete\" cho từng mục\r\n");
      out.write("                document.querySelectorAll('.delete-schedule').forEach(function (item) {\r\n");
      out.write("                    item.addEventListener('click', function (event) {\r\n");
      out.write("                        event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("                        // Lưu trữ thẻ <tr> chứa thông tin phản hồi\r\n");
      out.write("                        var feedbackRow = this.closest('tr');\r\n");
      out.write("\r\n");
      out.write("                        // Lấy giá trị ID từ phần tử <td> trong thẻ <tr>\r\n");
      out.write("                        var feedbackId = feedbackRow.querySelector('td:first-child').textContent;\r\n");
      out.write("\r\n");
      out.write("                        // Hiển thị bảng thông báo xác nhận xóa\r\n");
      out.write("                        var confirmation = confirm(\"Bạn có chắc chắn muốn xóa?\");\r\n");
      out.write("\r\n");
      out.write("                        // Kiểm tra sự chấp nhận của người dùng\r\n");
      out.write("                        if (confirmation) {\r\n");
      out.write("                            // Tạo một đường dẫn (URL) mới với action \"Delete Feedback Dentist\" và ID của phản hồi\r\n");
      out.write("                            var url = 'MainController?action=deleteDentist&dentistID=' + feedbackId;\r\n");
      out.write("\r\n");
      out.write("                            // Chuyển hướng đến đường dẫn mới\r\n");
      out.write("                            window.location.href = url;\r\n");
      out.write("                        } else {\r\n");
      out.write("                            // Xử lý khi người dùng không đồng ý xóa\r\n");
      out.write("                            console.log('Hủy xóa');\r\n");
      out.write("                            // Có thể thực hiện các hành động khác tại đây (ví dụ: tắt form)\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- doctors23:17-->\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("listDentist");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listDentist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("dentist");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDentist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"dentistProduct col-md-4 col-sm-4  col-lg-3\">\r\n");
          out.write("                                <div class=\"profile-widget\">\r\n");
          out.write("                                    <div class=\"doctor-img\">\r\n");
          out.write("                                        <a class=\"avatar\" href=\"MainController?action=dentistProfile&dentistID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dentist.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img alt=\"\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dentist.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"dropdown profile-action\">\r\n");
          out.write("                                        <a href=\"#\" class=\"action-icon dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\r\n");
          out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
          out.write("                                            <a class=\"dropdown-item\" href=\"editDentist.jsp?dentistID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dentist.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-pencil m-r-5\"></i> Chỉnh sửa</a>\r\n");
          out.write("                                            <a class=\"dropdown-item delete-schedule\" href=\"MainController?action=deleteDentist&dentistID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dentist.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-trash-o m-r-5\"></i> Xóa Nhân Viên</a>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <h4 class=\"doctor-name text-ellipsis\"><a href=\"MainController?action=dentistProfile&dentistID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dentist.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dentist.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\r\n");
          out.write("                                    <h4></h4>\r\n");
          out.write("                                    <div class=\"user-country\">\r\n");
          out.write("                                        <i class=\"fa fa-map-marker\"></i> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dentist.degree}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
