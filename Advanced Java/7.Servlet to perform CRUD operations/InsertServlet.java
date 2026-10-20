package InsertServlet;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
protected void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException {
res.setContentType("text/html");
PrintWriter out=res.getWriter();

try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
PreparedStatement p=c.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");

p.setInt(1,Integer.parseInt(req.getParameter("rollno")));
p.setString(2,req.getParameter("studentname"));
p.setString(3,req.getParameter("course"));
p.setString(4,req.getParameter("mobileno"));

out.println(p.executeUpdate()>0?
"<h3>Student Inserted Successfully!</h3>":
"<h3>Insertion Failed!</h3>");
out.println("<a href='index.html'>Go Back</a>");
p.close();
c.close();
}catch(Exception e){
out.println("<h3>Error: "+e.getMessage()+"</h3>");
}
}
}
