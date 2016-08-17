
<%@ includefile="Header.jsp"%>
<style>
body {
    background-image: url("resources/images/pic112.jpg");
}
h3{
color:black;
}

</style>
</head>
<center>

<body >


<form action="Usercheck"method="post">

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<h1 style=color:red;"><b>Please Enter Following Fields to Login</b></h1>
<h3 style=color:red;"><b>Enter Username:</b></h3><h3><input type="text"name="txtlogin"></h3>
<h3 style=color:red;"><b>Enter password:</b></h3><h3><input type="password"name="txtpass"></h3>
<input type="submit" value="Submit">
<input type="reset"value="cancel">
<a href="SignUp"><h3 style=color:red;"><b>New user Signup</b></h3></a>
</form>
</body>
</center>
</html>