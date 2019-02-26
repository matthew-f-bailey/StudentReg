
<style>
	span.error {
	color: red;
	display: inline-block;
	}
</style>
<form action="signupProcess" method="post">
  <h2>SignUp</h2>
		<p>
			<label for="firstname" class="floatLabel">First Name</label><br></br>
			<input id="firstname" pattern = "^[a-zA-Z]+$" title= "Only A-Z Allowed" class = "SignupController" name="firstname" placeholder="A-Z, 5-25 Char" type="text">
		</p>
		<p><font size = 2 color="red">${sizeError}</font></p>
		<p>
			<label for="lastname" class="floatLabel">Last Name</label><br></br>
			<input id="lastname" pattern = "^[a-zA-Z]+$" title= "Only A-Z Allowed" class = "SignupController" name="lastname" placeholder="A-Z, 5-25 Char" type="text">
		</p>
		<p><font size = 2 color="red">${sizeError}</font></p>
		<p>
			<label for="dob" class="floatLabel">Date of Birth</label><br></br>
			<input id="dob" class = "SignupController" name="dob" type="date" value="2001-01-01">
		</p>
		
		<p>
			<label for="pin" class="floatLabel">Pin Number</label><br></br>
			<input id = pin type = "password" name = "pin"  pattern="[0-9]{4}" title="4 digit number: e.g. 1234" placeholder="e.g. 1234" required>
		</p>
		<p>
			<input type="submit" value="Create My Account"  id="submit">
		</p>
	</form>
<strong><a href="index.jsp">Home</a></strong>