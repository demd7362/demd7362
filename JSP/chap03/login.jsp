<%@ page contentType="text/html; charset=utf-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    if(id != null && id.equals("jihun") && pw.equals("951012")){
        response.sendRedirect("index.jsp");
    } else {
        %>
<html>
<head><title>로그인 실패</title></head>
<body>
잘못된 아이디 입니다.
</body>
</html>
<% } %>