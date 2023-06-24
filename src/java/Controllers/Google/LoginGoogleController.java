package Controllers.Google;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.GooglePojo;
import DAL.GoogleDAO;
import DAL.UserDAO;
import Models.User;
import javax.servlet.http.HttpSession;

@WebServlet("/login-google")
public class LoginGoogleController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginGoogleController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String code = request.getParameter("code");
            if (code == null || code.isEmpty()) {
                RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
                dis.forward(request, response);
            } else {
                String accessToken = GoogleDAO.getToken(code);
                GooglePojo googlePojo = GoogleDAO.getUserInfo(accessToken);
                boolean result = UserDAO.isExistAccountLoginByGoogle(googlePojo.getId());
                if (result) {
                    User user = UserDAO.getUserLoginByGoogle(googlePojo.getId());
                    HttpSession session = request.getSession();
                    session.setAttribute("User", user);
                    RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
                    dis.forward(request, response);
                } else {
                    request.setAttribute("id", googlePojo.getId());
                    request.setAttribute("name", googlePojo.getName());
                    request.setAttribute("email", googlePojo.getEmail());
                    request.setAttribute("logbygg", true);
                    RequestDispatcher dis = request.getRequestDispatcher("additional-info.jsp");
                    dis.forward(request, response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
