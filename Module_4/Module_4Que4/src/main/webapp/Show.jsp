<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
<%@page import="java.util.List"%>
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
	margin: auto;
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
	<th>Name</th>
	<th>Email</th>
	<th>Phone</th>
</tr>

<%
	List<Model>list = Dao.viewdata();
	for(Model m : list)
	{
%>

<tr>
	<td><%=m.getId() %></td>
	<td><%=m.getName() %></td>
	<td><%=m.getEmail() %></td>
	<td><%=m.getPhone() %></td>
</tr>

<%

	}

%>

</table>
</div>
</body>
</html>