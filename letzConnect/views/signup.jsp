<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign Up</title>
</head>
<center><body>
	<div class="form-container">

		<h1>Registration Form</h1>

		<form:form method="POST" modelAttribute="users"
			class="form-horizontal" action="register"
			enctype="multipart/form-data">

			<div class="row">
				<div class="form-group col-md-12">
	<label class="col-md-3 control-lable" for="username">UserName</label>
					<div class="col-md-5">
						<form:input type="text" path="username" id="username"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="username" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			<%--  <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="name">Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="name" id="name" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="name" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div> --%>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="password">Password</label>
					<div class="col-md-5">
						<form:input type="password" path="password" id="password"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="password" class="help-inline" />
						</div>
					</div>
				</div>

				<div class="row">
<div class="form-group col-md-12">
<label class="col-md-3 control-lable" for="email">EmailId:</label>
						<div class="col-md-5">
							<form:input type="text" path="emailid" id="emailid"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="emailid" class="help-inline" />
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-3 control-lable" for="mobile">Mobile:</label>
						<div class="col-md-5">
							<form:input type="text" path="mobile" id="mobile"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="mobile" class="help-inline" />
							</div>
						</div>
					</div>
				</div>


				<div class="row">
					<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="location">Address:</label>
						<div class="col-md-5">
							<form:input type="text" path="address" id="address"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="address" class="help-inline" />
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
		<label class="col-md-3 control-lable" for="image">ProfilePicture:</label>
						<div class="col-md-5">
							<form:input type="file" path="image" id="image"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="image" class="help-inline" />
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="form-actions floatRight">
						<input type="submit" value="Register"
							class="btn btn-primary btn-sm">
					</div>
				</div>
		</form:form>
	</div>
	
</body>
</center>
<%@ include file="footer.jsp"%>


