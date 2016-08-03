<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
body {
    background-image: url("resources/images/pic101.jpg");
}
</style>


</head>
<body>
<body bgcolor="grey">

<center><h2>Please fill following Details to Register</h2> 
<form action="Login">

First name:&nbsp&nbsp
<input type="text"name="firstname"required/><br><br>
Last name:&nbsp&nbsp            
<input type="text"name="lastname"><br><br>
Fathername:&nbsp
<input type="text"name="fathername"required/><br><br>
Username:&nbsp&nbsp&nbsp
<input type="text"name="Username"required/><br><br>
Password:&nbsp&nbsp&nbsp&nbsp
<input type="password" name="textpass"required/><br><br>
Dateofbirth:
<input type="text"name="Date of birth"required/><br><br>

<input type="radio" name="gender" value="male" checked> Male
<input type="radio" name="gender" value="female"> Female
<input type="radio" name="gender" value="other"> Other<br><br>
Cityname:&nbsp&nbsp
<input type="text name="city"><br><br>
State:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<input type="text name="State"required/><br><br>
Country:&nbsp&nbsp&nbsp&nbsp&nbsp
<input type="text name="country"required/><br><br>
Mobile:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<input type="text name="Mobile"required/><br><br>
<input type="submit" value="Submit">
 
<a href="Entry.html"><h3 align="left">Back</h3></a>

</center>
</form>
</body>
</html>