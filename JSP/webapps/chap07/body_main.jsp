<%@ page contentType="text/html; charset=utf-8" %>
<% request.setCharacterEncoding("utf-8"); %>
<%-- 위 코드를 지우면 jsp:param 값이 입력되지 않는다. --%>
<html>
<head>
<title>
body_main
</title>
</head>
<body>
include 전 name 파라미터 값: <%= request.getParameter("name") %>
<hr>
<jsp:include page="body_sub.jsp" flush="false">
    <jsp:param name="name" value="정지훈" />
</jsp:include>
<hr/>
include 후 name 파라미터 값: <%= request.getParameter("name") %>
<br>
</body>
</html>