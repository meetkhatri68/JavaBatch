<%@page import="java.util.List"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
<%@page import="javax.swing.ListModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.container{
	background:  #2d3e3f ;
	color: white;
	width: 900px;
	height: 600px;
	padding-bottom: 20px;
	position: absolute;
	top:50%;
	left: 50%;
	transform: translate(-50%, -50%);
	margin: auto;n
  padding: 70px 50px 20px 50px;
}

.pad th{padding: 10px;
background-color: red;
}

.label{font-weight: 700; font-size: larger;}


</style>

</head>
<body>
	<div align="center" class="container">
	<label class="label">Show Data</label>
	<br>
	<br>
	
	
	<table border="1">
	<tr class=pad>
		<th>id</th>
		<th>Fname</th>
		<th>Lname</th>
		<th>Phone</th>
		<th>Email</th>
		<th>Gender</th>
		<th>Password</th>
		<th>Action</th>
		
	</tr>
	
<%
	List<Model>list = Dao.showdata();
	for(Model m : list)
	{
%>

	<tr>
		<td><%=m.getId() %></td>
		<td><%=m.getFname() %></td>
		<td><%=m.getLname() %></td>
		<td><%=m.getPhone() %></td>
		<td><%=m.getEmail() %></td>
		<td><%=m.getGender() %></td>
		<td><%=m.getPassword() %></td>
		
		<td>
			<a href="delete.jsp?id=<%=m.getId()%>"><img src="https://as2.ftcdn.net/v2/jpg/03/15/96/35/1000_F_315963545_qxvJX01q9E7LfyLFjlLtfdgvJ0nRyKne.jpg" width="20" height="20"/></a>
			<a href="edit.jsp?id=<%=m.getId()%>"><img src="https://png.pngtree.com/png-vector/20190329/ourmid/pngtree-vector-edit-icon-png-image_889355.jpg" width="20" height="20"/></a>
		</td>
	</tr>
	
<%
	
	}	
%>

</table>
	
</div>

</body>
</html>