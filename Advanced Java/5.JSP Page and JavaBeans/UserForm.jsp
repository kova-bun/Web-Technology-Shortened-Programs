<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Employee Salary</title></head>
<body>
<h3>Enter Employee Salary Details</h3>
<form action="displayUser.jsp" method="post">
Name: <input name="name" required><br><br>
Basic Pay: <input type="number" name="basicPay" required><br><br>
DA: <input type="number" name="da" required><br><br>
HRA: <input type="number" name="hra" required><br><br>
<input type="submit" value="Calculate Gross Salary">
</form>
</body>
</html>