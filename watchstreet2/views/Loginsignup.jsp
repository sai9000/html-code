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
		<form action="register" method="post">

			<b>Email:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</b><input type="text" name="Email"
				required /> <br> <br> <b>Firstname:</b> <input
				type="text" name="Firstname" required /><br> <br> <b>Lastname:&nbsp</b>
			<input type="text" name="Lastname" required /><br> <br>
			<b>Mobile:&nbsp&nbsp&nbsp</b> <input type="text" name="Mobile"
				required /><br> <br> <b>Address:&nbsp&nbsp&nbsp&nbsp</b>
			<input type="Address" name="Address" required /><br> <br>
			<b>Dateofbirth:</b> <input type="text" name="Dateofbirth" required /><br>
			<br> 
			
			
			<b>Password:&nbsp&nbsp</b><input type="text" name="Password"><br>
			<br><b>Username:&nbsp&nbsp&nbsp</b><input
				type="text" name="Username"required /><br> <br> 
				<input type="submit" value="Submit">&nbsp&nbsp <input type="reset"
				value="Reset">
			
	</center>
	</form>
</body>
</html>