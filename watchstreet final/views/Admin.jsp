<%@ includefile="headers.jsp"%>
<center><h2>Welcome to Admin</h2></center>
<hr>
<br>
<br>
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
 <li><a href="viewitem">View all</a></li>
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

 <%@include file="Footer.jsp"%>




