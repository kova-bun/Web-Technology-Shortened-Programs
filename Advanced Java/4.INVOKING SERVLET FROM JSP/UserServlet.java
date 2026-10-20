package UserServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

String name = request.getParameter("name");
String email = request.getParameter("email");

String processedName = name.toUpperCase();
String processedEmail = email.toLowerCase();

request.setAttribute("pname", processedName);
request.setAttribute("pemail", processedEmail);

RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
rd.forward(request, response);
}
}