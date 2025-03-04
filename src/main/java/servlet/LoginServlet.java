package servlet;


import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.jetbrains.dao.UserOperations;
import com.jetbrains.model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserOperations userOperations = new UserOperations();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null) {  // Ensure you're not comparing boolean with null
            // Perform your login validation here
            if (username.equals("admin") && password.equals("password123")) {
                // Redirect to the dashboard or main page
                response.sendRedirect("dashboard.jsp");
            } else {
                // Invalid login attempt
                response.sendRedirect("login.jsp?error=true");
            }
        } else {
            // Handle case where username or password is missing
            response.sendRedirect("login.jsp?error=true");
        }

    }
}
