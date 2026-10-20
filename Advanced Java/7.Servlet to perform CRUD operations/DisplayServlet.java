package DisplayServlet;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
protected void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException {
res.setContentType("text/html");
PrintWriter out=res.getWriter();

try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
Statement s=c.createStatement();
ResultSet r=s.executeQuery("SELECT * FROM employee");

out.println("<h2>Student Details</h2><table border='1' cellpadding='8'>");
out.println("<tr><th>Roll No</th><th>Name</th><th>Course</th><th>Mobile</th></tr>");

while(r.next())
out.println("<tr><td>"+r.getInt(1)+"</td><td>"+
r.getString(2)+"</td><td>"+r.getString(3)+
"</td><td>"+r.getString(4)+"</td></tr>");

out.println("</table><br><a href='index.html'>Go Back</a>");
r.close();
s.close();
c.close();
}catch(Exception e){
out.println("<h3>Error: "+e.getMessage()+"</h3>");
}
}
}
