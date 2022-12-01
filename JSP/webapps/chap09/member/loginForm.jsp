<%@ page contentType="text/html; charset=utf-8" %>


<html>
<head>
<title>
로그인 폼
</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/member/login.jsp" method="post">
<label for="">아이디</label>
<input type="text" name="id" size="10">
<label for="">비밀번호</label>
<input type="text" name="pw" size="10">
<input type="submit" value="로그인">
</form>
</body>
</html>