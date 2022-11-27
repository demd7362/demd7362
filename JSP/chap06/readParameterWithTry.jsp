<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>
파라미터 출력
</title>
</head>
<body>
<% try { %>
  <%= request.getParameter("name").toUpperCase() %>
<% } catch (Exception e) { %>
    name 파라미터가 올바르지 않습니다.
<% } %>
</body>
</html>