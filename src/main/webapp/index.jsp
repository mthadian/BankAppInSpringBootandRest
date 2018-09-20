<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addCustomer">
	 <input type="text" name="Cid" placeholder="National ID"><br>
	 <input type="text" name="firstName" placeholder="First Name"><br>
	<input type="text" name="middleName" placeholder="Middle Name"><br>
	 <input type="text" name="lastName" placeholder="Last Name"><br>
	
	<input type="submit">
	</form>
	
		<br/>
		Search Customer by Account Number
 	<form action="getCustomer">
		 <input type="text" name="Cid" placeholder="search Customer by ID">
		 <input type="submit" value="Search">
	</form>
	<br/>
	<br/>
	Search Customer Accounts
	<form action="getcusAccounts">
		 <input type="text" name="customerId" placeholder="Enter Customer ID">
		 <input type="submit" value="Search">
	</form>
</body>
</html>