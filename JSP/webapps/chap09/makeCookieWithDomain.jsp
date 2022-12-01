<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.net.URLEncoder" %>
<%
    Cookie cookie1 = new Cookie("id","jihun");
    cookie1.setDomain(".somehost.com");
    response.addCookie(cookie1);

    Cookie cookie2 = new Cookie("only","onlyCookie");
    response.addCookie(cookie2);

    Cookie cookie3 = new Cookie("invalid","invalidCookie");
    cookie3.setDomain("javacan.tistory.com");
    response.addCookie(cookie3);
    %>

<html>
<head>
<title>
쿠키 생성
</title>
</head>
<body>
다음과 같이 쿠키를 생성했습니다. <br>
<%= cookie1.getName() %> = <%= cookie1.getValue() %>
[<%= cookie1.getDomain() %>]
<br>
<%= cookie2.getName() %> = <%= cookie2.getValue() %>
[<%= cookie2.getDomain() %>]
<br>
<%= cookie3.getName() %> = <%= cookie3.getValue() %>
[<%= cookie3.getDomain() %>]
<br>
</body>
</html>