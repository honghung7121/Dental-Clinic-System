/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers.Treatment_Dentist;

import DAL.DentistDAO;
import DAL.ServiceDAO;
import DAL.TreatmentCourseDAO;
import DAL.TreatmentCourseDetailDAO;
import DAL.UserDAO;
import Models.Dentist;
import Models.Service;
import Models.TreatmentCourseDetail;
import Models.User;
import Util.SendMail;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author ADMIN
 */
public class EditTreatmentDetailController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String idTreatment =(String) session.getAttribute("idTreatment");
            String idDetail = request.getParameter("idDetail");
            final String DateDetail = request.getParameter("editDateDetail");
            final String TimeDetail = request.getParameter("editTimeDetail");
            String ServiceDetail = request.getParameter("editServiceDetail");
            String DescriptionDetail = request.getParameter("editDescriptionDetail");
            String StatusDetail = request.getParameter("editStatusDetail");
            String StatusPaidDetail = request.getParameter("editStatusPaidDetail");

            TreatmentCourseDetail den = TreatmentCourseDetailDAO.getTreatmentDetailByID(idDetail);
            String denOld = den.getDescription();
            if (DescriptionDetail == null || DescriptionDetail.isEmpty()) {
                DescriptionDetail = denOld; 
            }
            
            TreatmentCourseDAO tmCourseDAO = new TreatmentCourseDAO();
            int idDentist = tmCourseDAO.getDentistByTreatmentCourseID(Integer.parseInt(idDetail));
            DentistDAO dentistDAO = new DentistDAO();
            final Dentist dentist = dentistDAO.getDentistByID(String.valueOf(idDentist));
            String a = den.getTreatmentdate();
            String b = den.getTreatmenttime();
            if(!den.getTreatmentdate().trim().equals(DateDetail.trim()) || !den.getTreatmenttime().trim().equals(TimeDetail.trim())){     
                //check trung ngay
                boolean checkDuplicate = TreatmentCourseDetailDAO.checkDuplicateDateTreatmentDetailOfDentist(idDentist, DateDetail, TimeDetail);
                if(checkDuplicate){
                    //Quay lại trang trước và hiện thông báo lỗi
                    request.setAttribute("reportDuplicate", "Thời gian này Nhã sĩ " + dentist.getFullName() + " đã có lịch khám. Khách hàng vui lòng chọn lại thời gian khác. Xin cảm ơn!");
                    request.getRequestDispatcher("edit-treatmentcoursedetail.jsp?idDetail="+idDetail).forward(request, response);
                    return;
                }
                //end check
            }
            
            boolean check = TreatmentCourseDetailDAO.updateTreatmentDetail(idDetail, DateDetail, TimeDetail,
                    ServiceDetail, DescriptionDetail, StatusDetail, StatusPaidDetail);
            
            //gui mail cho khach hang
            String reportStatus ="";
            if (StatusDetail.equals("1")) {
                reportStatus = "Đã hoàn thành";
            } else {
                reportStatus = "Chưa hoàn thành";
            }
            
            LocalDate localDate = LocalDate.parse(DateDetail);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            final String formattedDate = localDate.format(formatter);
            final String description = DescriptionDetail;

            int idPatient = TreatmentCourseDetailDAO.getIDPatientByTreatmentID(idTreatment);
            final User patient = UserDAO.getPatient(idPatient);
            final Service serviceNew = ServiceDAO.getServiceById(Integer.parseInt(ServiceDetail));
            final String rpStatus = reportStatus;
            if (check) {
                Runnable myRunnable = new Runnable() {
                    public void run() {
                        // Các công việc được thực thi trong luồng này
//                        // Đường dẫn tới hình ảnh
//                        String imagePath = "http://localhost:8080/SWP391-SE1743/img/anhquangcao.jpg";
//
//                        // Tạo thẻ <img> chứa đường dẫn hình ảnh
//                        String imageTag = "<img src=\"" + imagePath + "\" alt=\"Ảnh quảng cáo\">";
                        
                        SendMail.sendEmail(patient.getEmail(), "Mail from Dental Clinic System", "Chào anh/chị,<br>"
                                + "<br>"
                                + "Xin thông báo lịch hẹn khám của quý khách đã được THAY ĐỔI. Vui lòng đọc kĩ những thay đổi sau đây để anh/chị đến khám đúng lịch hẹn.<br>"
                                + "Dưới đây là thông tin chi tiết lịch hẹn khám của bạn:<br>"
                                + "<br>" 
                                + "Khách hàng: " + patient.getFullName() + "<br>"
                                + "Dịch vụ: " + serviceNew.getName() + "<br>"
                                + "Ngày hẹn: " + formattedDate + "<br>"
                                + "Thời gian: " + TimeDetail + "<br>"         
                                + "Nha sĩ: " + dentist.getFullName() + "<br>"
                                + "Ghi chú (nếu có): " + description + "<br>"
                                + "Trạng thái: " + rpStatus + "<br>"
                                + "Địa chỉ: Quận 9, Thành phố Hồ Chí Minh<br>"
                                + "<br>"
                                + "Chúng tôi rất mong được gặp bạn vào ngày hẹn trên. Để đảm bảo quá trình hẹn được diễn ra thuận lợi, vui lòng lưu ý các thông tin sau:<br>"
                                + "<br>"
                                + "1. Đảm bảo bạn có đến đúng giờ để không làm ảnh hưởng đến lịch trình của chúng tôi và các khách hàng khác.<br>"
                                + "2. Mang theo tất cả các tài liệu, giấy tờ cần thiết hoặc bất kỳ mục đích đặc biệt nào liên quan đến cuộc hẹn của bạn.<br>"
                                + "3. Trong trường hợp bạn không thể tham dự cuộc hẹn này, vui lòng liên hệ với chúng tôi để chúng ta có thể sắp xếp lại một thời gian thích hợp khác.<br>"
                                + "<br>"
                                + "Nếu bạn có bất kỳ câu hỏi hoặc yêu cầu bổ sung nào, xin vui lòng liên hệ với chúng tôi qua email hoặc số điện thoại dưới đây.<br>"
                                + "<br>"
                                + "Email: dentalclinicbookingsystem@gmail.com<br>"
                                + "Số điện thoại: +84 374 312 384<br>"
                                + "<br>"
                                + "Chúng tôi rất mong được gặp bạn và hỗ trợ bạn trong cuộc hẹn sắp tới. Xin vui lòng cho chúng tôi biết nếu có bất kỳ thay đổi nào trong lịch trình của bạn.<br>"
                                + "<br>"
                                + "Trân trọng,<br>"
                                + "Nha Khoa DentCare", "Thông tin lịch hẹn");
                    }
                };  
                Thread thread = new Thread(myRunnable);
                thread.start();
            }
            boolean checkComplete = TreatmentCourseDetailDAO.checkCompleteTreatment(idTreatment);
            if(checkComplete){
                TreatmentCourseDAO.UpdateStatusTreatment(idTreatment, 1);
            } else {
                TreatmentCourseDAO.UpdateStatusTreatment(idTreatment, 0);
            }
            request.setAttribute("reportDuplicate",null);
            request.getRequestDispatcher("MainController?action=ViewTreatmentDetailByCustomer").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
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
