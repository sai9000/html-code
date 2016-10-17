<%@includefile="headers.jsp" %>
<br><br><br>
<table class="table table-striped">
<tr>

<th>Product Name</th>
<th>Product Description</th>
<th>Product Price</th>
<th>Product Quantity</th>
<th>Product Image</th>
</tr>
<tr>

<td>${product.name}</td>
<td>${product.description}</td>
<td>${product.price}</td>
<td>${product.quantity}</td>
<td><img src="resources/images/${product.name}.jpg" style=height:200px;width:200px;"/></td>
<td><a href="UserCheck">Add to Cart</a>
</tr>

</table>

</body>
</html>


	
<div><%@include file="Footer.jsp"%></div>


