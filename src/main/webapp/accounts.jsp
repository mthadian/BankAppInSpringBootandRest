<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
//add account
	<form action="addAccount">
	 <input type="text" name="AccId"><br>
	 <input type="text" name="CustomerId"><br>
	<input type="text" name="AccountBalance"><br>
	<input type="submit">
	</form>
	<br/>
	<br/>
	Search Account by Account Number
 	<form action="getAccount">
		 <input type="text" name="AccId" placeholder="search Account by Acc No.">
		 <input type="submit" value="Search">
	</form>
	<br/>
		Search Customer by Account Number
 	<form action="getCustomer">
		 <input type="text" name="Cid" placeholder="search Customer by ID">
		 <input type="submit" value="Search">
	</form>
	
	
</body>
</html>