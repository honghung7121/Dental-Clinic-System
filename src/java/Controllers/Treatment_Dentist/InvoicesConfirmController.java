/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Treatment_Dentist;


import DAL.TreatmentCourseDAO;
import DAL.TreatmentCourseDetailDAO;
import Util.SendMail;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class InvoicesConfirmController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();

        try {

            String idTreatment = (String) session.getAttribute("idTreatment");
            String totalAmount = request.getParameter("totalAmount");
            // Parse the totalAmount as a double (assuming it's a numeric value)
            double amount = Double.parseDouble(totalAmount);
            // Set the locale to Vietnamese (vi_VN)
            Locale locale = new Locale("vi", "VN");

            //Định dạng số tiền dưới dạng tiền tệ bằng ngôn ngữ tiếng Việt
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
            final String formattedAmount = currencyFormatter.format(amount);
            // Split the concatenated nameServices into separate values
            
            // Process the individual nameService values

            // Do something with each nameService value
            boolean confirm = TreatmentCourseDetailDAO.invoicesConfirm(idTreatment);
            boolean check = TreatmentCourseDetailDAO.invoicesCheck(idTreatment);
            if (check) {
                boolean update = TreatmentCourseDetailDAO.invoicesUpdate(idTreatment);
            }
            final String mail = TreatmentCourseDetailDAO.getMailPatientByTreatmentID(idTreatment);
            Runnable myRunnable = new Runnable() {
                public void run() {
                    // Các công việc được thực thi trong luồng này
                    SendMail.sendEmail(mail, "Mail from Dental Clinic System", "Chào anh/chị,<br>"
                            + "<br>Dịch vụ của quý khách đã được thanh toán thành công.<br>"
                            + "Số tiền đã được thanh toán:" + formattedAmount
                            + "<br>Chúng tôi xin chân thành cảm ơn sự ủng hộ và tin tưởng mà quý khách đã dành cho chúng tôi.<br>"
                            + " Điều này thực sự là một động lực lớn để chúng tôi tiếp tục cung cấp dịch vụ chất lượng cao và mang đến nụ cười và sự hài lòng cho quý khách.<br>"
                            + "Nếu bạn có bất kỳ câu hỏi hoặc yêu cầu bổ sung nào, xin vui lòng liên hệ với chúng tôi qua email hoặc số điện thoại dưới đây.<br>"
                            + "<br>"
                            + "Email: DentalClinic@gmail.com<br>"
                            + "Số điện thoại: +84 374 312 384<br>"
                            + "Chúng tôi cam kết duy trì tiêu chuẩn chất lượng tốt nhất và đáp ứng mọi nhu cầu của quý khách. Hân hạnh được phục vụ quý khách và hy vọng sẽ có cơ hội tiếp tục đồng hành cùng quý khách trong tương lai."
                            + "Trân trọng,<br>"
                            + "Nha Khoa DentCare",
                            "InvoicesConfirm");
                }
            };
            Thread thread = new Thread(myRunnable);
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            request.getRequestDispatcher("MainController?action=ViewTreatmentInvoicesOfDentist").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
