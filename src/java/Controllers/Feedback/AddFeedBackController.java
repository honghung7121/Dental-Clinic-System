/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers.Feedback;

import DAL.FeedbackDentistDAO;
import DAL.FeedbackServiceDAO;
import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class AddFeedBackController extends HttpServlet {

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
        try{
            HttpSession session = request.getSession();
            User user = (User)session.getAttribute("User");
            int dentistID = Integer.parseInt(request.getParameter("dentistID"));
            int serviceID = Integer.parseInt(request.getParameter("serviceID"));
            int dentistRate = Integer.parseInt(request.getParameter("dentistRate"));
            int serviceRate = Integer.parseInt(request.getParameter("serviceRate"));
            String dentistFeedback = request.getParameter("dentistFeedback");
            String serviceFeedback = request.getParameter("serviceFeedback");
            FeedbackDentistDAO feedbackDentistDAO = new FeedbackDentistDAO();
            FeedbackServiceDAO feedbackServiceDAO = new FeedbackServiceDAO();
            feedbackDentistDAO.addFeedBackDentist(user.getId(), dentistID, dentistRate, dentistFeedback);
            feedbackServiceDAO.addFeedBackService(user.getId(), serviceID, serviceRate, serviceFeedback);
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            request.getRequestDispatcher("TreatmentCourseController").forward(request, response);
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
