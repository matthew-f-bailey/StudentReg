<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
 <!-- @page contentType="text/html" pageEncoding="UTF-8" --> <!--When I use this line has conflict error -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>
</title>

</head>
	<body>
		<h1>Successfully Logged In</h1>
		<p>Your Student ID and Pin are listed below, please save them as you will use them to log in.</p>
		<p><b>Student ID: ${studentid}</b></p>
		<p>PIN: ${pin}</p>
		<p>Student ID in Session: <%=session.getAttribute("studentid")%></p>
	
		<form action="showCourses" method="post">
	 		 	<p>
					<input type="submit" value="Register for Courses"  id="submit">
				</p>
		</form>
	</body>
</html>