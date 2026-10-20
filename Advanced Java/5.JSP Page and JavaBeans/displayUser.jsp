<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="salary" class="UserBean.UserBean" scope="request"/>
<jsp:setProperty name="salary" property="*"/>
<!DOCTYPE html>
<html>
<head><title>Gross Salary</title></head>
<body>
<h3>Employee Salary Details</h3>
<p><b>Name:</b> ${salary.name}</p>
<p><b>Basic Pay:</b> ${salary.basicPay}</p>
<p><b>DA:</b> ${salary.da}</p>
<p><b>HRA:</b> ${salary.hra}</p>
<p><b>Gross Salary:</b> ${salary.grossSalary}</p>
<a href="UserForm.jsp">Go Back</a>
</body>
</html>