
<%@ includefile="Header.jsp" %>
<style>
body {
	background-image: url("resources/images/pic111.jpg");
}
</style>
</head>
<body>


	<center>
		<h2>Please fill following fields to Register</h2>
		<form action="Login">

			<b>First name:&nbsp&nbsp</b><input type="text" name="firstname"
				required /> <br> <br> <b>Last name:&nbsp&nbsp</b> <input
				type="text" name="lastname" required /><br> <br> <b>Fathername:&nbsp</b>
			<input type="text" name="fathername" required /><br> <br>
			<b>Username:&nbsp&nbsp&nbsp</b> <input type="text" name="Username"
				required /><br> <br> <b>Password:&nbsp&nbsp&nbsp&nbsp</b>
			<input type="password" name="textpass" required /><br> <br>
			<b>Dateofbirth:</b> <input type="text" name="Date of birth" required /><br>
			<br> <input type="radio" name="gender" value="male" checked>
			<b>Male</b> <input type="radio" name="gender" value="female">
			Female <input type="radio" name="gender" value="other"> Other<br>
			<br>
			<b> Cityname:&nbsp&nbsp</b> <input type="text name="city"><br>
			<br> <b>State:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</b><input
				type="text name=" State"required /><br> <br> <b>Country:&nbsp&nbsp&nbsp&nbsp&nbsp</b>
			<input type="text name=" country"required /><br> <br>
			<b> Mobile:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </b><input
				type="text name=" Mobile"required /><br> <br> 
				<input type="submit" value="Submit">&nbsp&nbsp <input type="reset"
				value="Reset">
			
	</center>
	</form>
</body>
</html>