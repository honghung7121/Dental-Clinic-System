/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAL.UserDAO;
import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class searchServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String searchName = request.getParameter("txtSearch");
            ArrayList<User> list = new ArrayList();
            list = UserDAO.getAllPatient();
            for (User user : list) {
                    if (searchName.contains(user.getFullName())) {
                        request.setAttribute("name", user);
                        request.getRequestDispatcher("patient.jsp").forward(request, response);
                    }
            }
            /* TODO output your page here. You may use following sample code. */
          //if (request.getParameter("txtSearch")!=null &&  !"".equals(request.getParameter("txtSearch"))) {
//                ArrayList<User> al = new ArrayList<>();
//                for (User acc : UserDAO.getAllPatient()) {
//                    if (acc.getEmail().equals(request.getParameter("txtSearch")) || acc.getFullName().equalsIgnoreCase(request.getParameter("txtSearch"))) {
//                        al.add(acc);
//                    }
//                }
//                request.setAttribute("patient", al);
//            }else{
//       
//            request.setAttribute("patient", UserDAO.getAllPatient());
//            request.getRequestDispatcher("patient.jsp").forward(request, response);
//   
//    }
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
