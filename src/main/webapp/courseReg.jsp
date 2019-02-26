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
	<h1>Course Registration</h1>
	<p>Register from the following Courses.</p>
	<p>Student ID: ${studentid}</p>
	<p>Pin: ${pin}</p>
	<p>StudentID in Session: <%=session.getAttribute("studentid")%></p>
	<form:form method="POST"
          action="regProcess" modelAttribute="course">
             <table>

	                <tr>
						<td>Choose a Course :</td>
						<td><form:radiobuttons path="coursename" items="${courseList}" />
		                                </td>
						<td><form:errors path="coursename" cssClass="error" /></td>
					</tr>
	               
	                <tr>
	                    <td><input type="submit" value="Submit"/></td>
	                </tr>

            </table>
        </form:form>
	
	<form action="logout" method="post">
	 		 	<p>
					<input type="submit" value="Logout"  id="submit">
				</p>
		</form>
</body>
</html>