<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Enter Details</title></head>
<body>
<h3>Enter Your Details</h3>
<form action="UserServlet" method="post">
Name: <input type="text" name="name" required><br><br>
Email: <input type="email" name="email" required><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>
