<%@ page contentType="text/html; charset=utf-8" %>
<%-- <jsp:foward> 액션 태그를 실행하면 생성했던 출력 결과는 모두 제거된다 --%>
<html>
<head>
<title>
from.jsp
</title>
</head>
<body>
이 페이지는 from.jsp가 생성한 것입니다.
<jsp:forward page="/to/to.jsp" />
이 문장은 jsp:forward 액션 태그의 다음으로 온 문장입니다.
</body>
</html>