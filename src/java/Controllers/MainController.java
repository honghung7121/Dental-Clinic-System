/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class MainController extends HttpServlet {
    private final String LOGIN = "LoginController"; 
    private final String SIGNUP = "SignUpController";
    private final String GETEMPLOYEES = "GetEmployeesController";
    private final String SEARCHEMPLOYEEBYROLE = "SearchEmployeeByRoleController";
    private final String SEARCHEMPLOYEEBYNAME = "SearchEmployeeByNameController";
    private final String DENTIST = "DentistController";
    private final String DENTISTPROFILE = "DentistProfileController";  
    private final String DENTISTEDIT = "EditDentistController"; 
    private final String GETEMPLOYEEBYID = "GetEmployeeByIDController";
    private final String EDITEMPLOYEECONTROLLER = "EditEmployeeController";
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
        String url = "";
        try{
            String action = request.getParameter("action");
            if(action.equals("Login")){
                url = LOGIN;
            }
            else if(action.equals("dentist")){
                url = DENTIST;
            }
            else if(action.equals("dentistProfile")){
                url = DENTISTPROFILE;
            }
            else if(action.equals("saveDentist")){
                url = DENTISTEDIT;
            }       

            else if(action.equals(request)){
                url = SIGNUP;
            }
            else if(action.equals("GetEmployees")){
                url = GETEMPLOYEES;
            }
            else if(action.equals("Search Employee By Role")){
                url = SEARCHEMPLOYEEBYROLE;
            }
            else if(action.equals("Search Employee By Name")){
                url = SEARCHEMPLOYEEBYNAME;
            }
            else if(action.equals("GetEmPloyeeByID")){
                url = GETEMPLOYEEBYID;
            }
            else if(action.equals("Edit Employee")){
                url = EDITEMPLOYEECONTROLLER;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
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
