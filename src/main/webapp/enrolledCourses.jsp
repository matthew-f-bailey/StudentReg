<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<h1>Your Enrolled Courses</h1>
	<p>StudentID in Session: <%=session.getAttribute("studentid")%></p>
	<p><font size= 5 color="red">${courseError}</font></p>
<table border=1>
				<tr>
			   		<td><strong>Course Name</strong></td>
			    </tr>
           <c:forEach var="i" items="${studentCourseList}" >
			   	<tr>
			   		<td>${i.coursename}</td>
			    </tr>
			</c:forEach>
 </table>
 		<form action="showCourses" method="post">
	 		 	<p>
					<input type="submit" value="Register More Courses"  id="submit">
				</p>
		</form>
		<form action="logout" method="post">
	 		 	<p>
					<input type="submit" value="Logout"  id="submit">
				</p>
		</form>
</body>


</html>