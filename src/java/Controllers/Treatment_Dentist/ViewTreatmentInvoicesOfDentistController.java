/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Treatment_Dentist;

import DAL.TreatmentCourseDAO;
import DAL.TreatmentCourseDetailDAO;
import Models.TreatmentCourse;
import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class ViewTreatmentInvoicesOfDentistController extends HttpServlet {

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
        String url = "invoices.jsp";
        try {
            /* TODO output your page here. You may use following sample code. */
            User user = (User) session.getAttribute("User");
            TreatmentCourseDAO sdao = new TreatmentCourseDAO();
            TreatmentCourseDetailDAO dao = new TreatmentCourseDetailDAO();
            ArrayList<TreatmentCourse> slist = sdao.getTreatmentByDentistID(Integer.toString(user.getId()));
            ArrayList<String> idList = new ArrayList<>();
            for (TreatmentCourse treatment : slist) {
                String idAsString = String.valueOf(treatment.getId());
                String checkPaid = String.valueOf(dao.treatmentCheck(idAsString));
                idList.add(checkPaid);
            }
            
            request.setAttribute("CheckPaid", idList);
            request.setAttribute("TreatmentList", slist);
            session.setAttribute("activeLink", "billLink");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
