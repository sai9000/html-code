<%@include file="Header.jsp" %>
</head>
<body>
<table style="width:100%">

<div class="container">
  
 <tr> 
 <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Categories
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="add-category">add-category</a></li>
      <li><a href="#">delete-category</a></li>
      <li><a href="#">update-category</a></li>
 <li><a href="#">view all-category</a></li>
    </ul>
  </div>
</div></td>

<div class="container">
  
  <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Products
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="Add">Add</a></li>
      <li><a href="#">Delete</a></li>
      <li><a href="#">Update</a></li>
 <li><a href="#">View all</a></li>
    </ul>
  </div>
</div>
</td>

<div class="container">
  
  <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Supplier
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="add-supplier">add-supplier</a></li>
      <li><a href="#">delete-supplier</a></li>
      <li><a href="#">update-supplier</a></li>
 <li><a href="#">View all-suppliers</a></li>
    </ul>
  </div>
</div>
</td>
</tr>
</table>
<br>
<br>
<br>
<br>
<br>
<br>
<center>
<form action="updatesupplier"method="post">
	
	<h2><b>&nbsp&nbsp&nbsp&nbspAdd Supplier</b></h2>
	 <br> <b>Supplier-name:</b> 
				
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="supplier-name" required /><br> <br> 


			
				<b>Supplier-description:&nbsp</b>
			<input type="text" name="supplier-description" required /><br> <br>
		
		
		<b>Supplier-Phone :&nbsp</b>
	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="supplier-phone" required /><br> <br>
					
		<b>Supplier-Address:&nbsp</b>
	&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="supplier-address" required /><br> <br>		
				
			
			<b>Supplier-Email :&nbsp</b>
	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="supplier-email" required /><br> <br>
									
		<input type="submit" value="Submit">&nbsp&nbsp <input type="reset"
				value="Reset">
			
			</form>
</center>
</body>
</html>