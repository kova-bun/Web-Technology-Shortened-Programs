package jdbcapp;
import java.sql.*;
import java.util.Scanner;

public class StudentJDBCApp {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/studentdb","root","");

while(true) {
System.out.println("\nStudent Management");
System.out.println("1. Insert Student");
System.out.println("2. Display Students");
System.out.println("3. Update Student");
System.out.println("4. Delete Student");
System.out.println("5. Exit");
System.out.print("Choose option: ");

int choice=sc.nextInt();
sc.nextLine();

if(choice==5) {
System.out.println("Exiting...");
break;
}

if(choice==2) {
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM student");
System.out.println("\nRollNo\tName\tCourse\tMobileNo");

while(rs.next())
System.out.println(rs.getInt("rollno")+"\t"+
rs.getString("studentname")+"\t"+
rs.getString("course")+"\t"+
rs.getString("mobileno"));

rs.close();
st.close();
}
else if(choice>=1 && choice<=4) {
System.out.print(choice==3?"Enter Roll No to update: ":
choice==4?"Enter Roll No to delete: ":"Enter Roll No: ");
int rollno=sc.nextInt();
sc.nextLine();

String sql;
if(choice==1)
sql="INSERT INTO student VALUES(?,?,?,?)";
else if(choice==3)
sql="UPDATE student SET studentname=?,course=?,mobileno=? WHERE rollno=?";
else
sql="DELETE FROM student WHERE rollno=?";

PreparedStatement ps=con.prepareStatement(sql);

if(choice!=4) {
System.out.print(choice==3?"Enter new Student Name: ":"Enter Student Name: ");
String name=sc.nextLine();
System.out.print(choice==3?"Enter new Course: ":"Enter Course: ");
String course=sc.nextLine();
System.out.print(choice==3?"Enter new Mobile No: ":"Enter Mobile No: ");
String mobile=sc.nextLine();

if(choice==1) ps.setInt(1,rollno);
int n=choice==1?2:1;
ps.setString(n,name);
ps.setString(n+1,course);
ps.setString(n+2,mobile);
if(choice==3) ps.setInt(4,rollno);
}
else ps.setInt(1,rollno);

int result=ps.executeUpdate();
String action=choice==1?"Inserted":choice==3?"Updated":"Deleted";
System.out.println(result>0?
"Student "+action+" Successfully!":
choice==1?"Insert Failed":choice==3?"Update Failed":"Delete Failed");
ps.close();
}
else System.out.println("Invalid Choice!");
}
con.close();
sc.close();

}catch(Exception e){
e.printStackTrace();
}
}
}
