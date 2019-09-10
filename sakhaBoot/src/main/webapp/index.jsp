<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- for add Employee -->
<h3>Register Employee </h3>
<form action="employee" method="post">

Enter Name <input type="text" name="empName"><br>
Enter Age <input type="text" name="age"><br>
Enter Password <input type = "password" name="password"><br>
Enter DOB <input type="date" name = "dob"><br>
Enter Salary <input type="text" name="salary">
<br>
<input type="submit" value="Register">
</form>

<hr>
<br>

<!-- Get Employee ID -->
<h3>Get Employee By ID</h3>
<form action="employeeid" method = "get">
	Enter the Employee ID <input type= "text" name = "empId"><br>
	<input type="submit" value="Get ID">
</form>

<hr>
<br>

<!-- Update Employee -->
<h3>Update Employee By ID</h3>
<form action="update" method = "get">
<input type="submit" value="Update">
</form>


<!-- Delete Employee -->
<h3>Delete Employee By ID</h3>
<form action="delete" method = "post">
<br>
Enter Employee ID <input type="text" name="empID">
<input type="submit" value="Delete">
</form>

<hr>
<br>


<!-- Get Employee ID -->
<h3>Get all Employees</h3>
<form action="findallemp" method = "get">
	
	<input type="submit" value="Get All Employees">
</form>

<hr>
<br>
</body>
</html>