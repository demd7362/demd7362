<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.net.URLEncoder" %>
<%
    Cookie[] cookies = request.getCookies();
    if(cookies != null){
        for(Cookie ck : cookies){
            if(ck.getName().equals("name")){
                Cookie cookie = new Cookie("name","");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
    }
%>
<html>
<head>
<title>
쿠키 삭제
</title>
</head>
<body>
name 쿠키를 삭제합니다.
</body>
</html>