<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>
웹 어플리케이션 경로 구하기
</title>
</head>
<body>
웹 어플리케이션 컨텍스트 경로: "<%= request.getContextPath() %>"
<p>http://localhost:8080/contextPath.jsp 로 접속할 시 경로가 뜨지 않습니다.
root 폴더에 파일이 있다면 jsp를 불러옵니다.
찾을 수 없다면 http 404 에러가 발생합니다.</p>
</body>
</html>