<%@ page contentType="text/html; charset=utf-8" %>
<%
    Cookie cookie = new Cookie("oneh","1시간");
    cookie.setMaxAge(60*60); // 1시간
    response.addCookie(cookie);
%>
<html> 
<head>
<title>
쿠키 유효시간 설정
</title>
</head>
<body>
유효시간이 1시간인 oneh 쿠키 생성했습니다.
<%= cookie.getName() %> = <%= cookie.getValue() %>
</body>
</html>