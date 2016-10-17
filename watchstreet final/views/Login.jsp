<%@ includefile="headers.jsp"%>
<%-- <body>

<form action="<c:url value="<!-- j_spring_security_check -->"/>" method="post">

<table>
<tr>
<td style="color:magenta"><b>USERNAME:</b></td>
<td><input type="text" name="j_username"/></td>
</tr>
<tr>
<td></td>
</tr>
<tr>
<td></td>
</tr>
<tr>
<td style="color:magenta"><b>PASSWORD:</b></td>
<td><input type="password" name="j_password"/></td>
</tr>


<tr>
<td><input type="submit" value="Login"/></td>

<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>

</body> --%>
<center>
<!-- <body style="padding-top:75px"> -->
<div class="container">
		<section id="content">
			<form action="perform_login" method="post">
				<h1>Login Form</h1>
				<div>
					<input type="text" placeholder="Username" required id="username" name="username" 
						pattern=".{1,10}" title="minimum length for name is 5"/>
				</div>
				<div>
					<input type="password" placeholder="Password" required id="password" name="password" 
					title="Enter Valid credentials"/>
				</div>
				<div>
					<input type="submit" value="Log in" /> <a href="#">Lost your
						password?</a> <a href="Register">Register</a>
				</div>
				
			</form>
			<!-- form -->
			<div class="button">
				<a href="Register">Get New Account</a>
			</div>
			<!-- button -->
		</section>
		<!-- content -->
	</div>
	<!-- container -->

</center>
</body>
</html>