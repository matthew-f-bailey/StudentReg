<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<form action="loginProcess" method="post">
  <h2>Login</h2>
			
		<p>
			<label for="studentid" class="floatLabel">Student ID</label><br></br>
			<input id="studentid" name="studentid" type="text">
		</p>
		<p>
			<label for="pin" class="floatLabel">Pin</label><br></br>
			<input id = pin type = "password" name = "pin"  pattern="[0-9]{4}" title="4 digit number: e.g. 1234" required>
		</p>
		<p>${message}</p>
		<p>
			<input type="submit" value="Login" id="submit">
		</p>
	</form>
	 <strong><a href="index.jsp">Home</a></strong>