<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>Employee List</h1>
    <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/module4"
        user="root" password="" />
    <sql:query dataSource="${db}" var="result">
        SELECT * FROM Que5
    </sql:query>
    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <c:forEach var="employee" items="${result.rows}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.fname}</td>
                <td>${employee.lname}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>