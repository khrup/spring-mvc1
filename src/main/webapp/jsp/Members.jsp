<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="java.util.List" %>
<%@ page import="hello.servlet.domain.member.MemberRespository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    MemberRespository memberRespository = MemberRespository.getInstance();
    List<Member> members = memberRespository.findAll();
%>
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
        <%
            for(Member member : members){
        %>
            <tr>
                <td><%=member.getId()%></td>
                <td><%=member.getUsername()%></td>
                <td><%=member.getAge()%></td>
            </tr>
        <%
            }
        %>
    </tbody>
</table>
</body>
</html>
