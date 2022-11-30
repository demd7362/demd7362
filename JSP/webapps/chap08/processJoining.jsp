<%@ page contentType="text/html; charset=utf-8" %>
<%
    request.setCharacterEncoding("utf-8");
    %>
<jsp:useBean id="memberInfo" class="chap08.member.MemberInfo" scope="request"/>
<jsp:setProperty name="memberInfo" property="*"/>
<%-- setProperty name=id property=name == id.setName(request.getParameter(name)) --%>


<html>
<head>
<title>
가입
</title>
</head>
<body>
<table width="400" border="1" cellpadding=0 cellspacing=0>
<tr>
    <td>아이디</td>
    <td><jsp:getProperty name="memberInfo" property="id" /> 
    <%-- <%= memberInfo.getName() %> --%>
    <td>패스워드</td>
    <td><jsp:getProperty name="memberInfo" property="password" /> </td>
</tr>
<tr>
    <td>이름</td>
    <td><jsp:getProperty name="memberInfo" property="name" /></td>
    <td>이메일</td>
    <td><jsp:getProperty name="memberInfo" property="email" /></td>
</tr>
</table>
</body>
</html>