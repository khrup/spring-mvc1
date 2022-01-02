<%--
  Created by IntelliJ IDEA.
  User: kong
  Date: 2022/01/02
  Time: 9:08 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <th>id</th>
    <th>username</th>
    <th>age</th>
    </thead>
    <tbody>
    <c:forEach var="item" items="${members}">
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.age}</td>
        </tr>

    </c:forEach>
    <%--<%
        for(Member member : members){
    %>
    <tr>
        <td><%=member.getId()%></td>
        <td><%=member.getUsername()%></td>
        <td><%=member.getAge()%></td>
    </tr>
    <%
        }
    %>--%>
    </tbody>
</table>
</body>
</html>