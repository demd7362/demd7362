<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>
include 디렉티브
</title>
</head>
<body>
<% int number = 10; %>
<%@ include file="includee.jspf" %>
공통변수 DATAFOLDER = "<%= dataFolder %>"
<p>includee.jspf에서 지정한 번호: <%= number %> </p>
</body>
</html>
<%-- jspf 파일 안의 코드가 삽입된 뒤, 자바 파일로 변환한다. --%>