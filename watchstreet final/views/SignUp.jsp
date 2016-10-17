<%@includefile="headers.jsp" %>
<center>
<form:form action="register" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>First name :</td>
				<td><form:input path="Firstname" />
					<form:errors path="Firstname" style="color:red"></form:errors></td>
			</tr>

			<tr>
				<td>Last name :</td>
				<td><form:input path="Lastname" />
					<form:errors path="Lastname" style="color:red"></form:errors></td>
			</tr>

			<tr>
				<td>User name :</td>
				<td><form:input path="Username" />
					<form:errors path="Username" style="color:red"></form:errors></td>
			</tr>




			<tr>
				<td>Date of birth :</td>
				<td><form:input path="Dateofbirth" />
					<form:errors path="Dateofbirth" style="color:red"></form:errors></td>
			</tr>


			<tr>
				<td>Password :</td>
				<td><form:password path="Password"/>
					<form:errors path="Password" style="color:red"></form:errors></td>
			</tr>
			<tr>
				<td>ConfirmPassword :</td>
				<td><form:password path="confirmpassword"/>
					<form:errors path="confirmpassword" style="color:red"></form:errors></td>
			</tr>
			
			
			
			
			
			
			<tr>
				<td>EmaiId :</td>
				<td><form:input path="Email" />
					<form:errors path="Email" style="color:red"></form:errors></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><form:input path="Address" />
					<form:errors path="Address" style="color:red"></form:errors></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><form:input path="Mobile" />
					<form:errors path="Mobile" style="color:red"></form:errors></td>
			</tr>

			<tr colspan="2">
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form:form>
</center>
 <%@include file="Footer.jsp"%>
