<%@ page contentType="text/html; charset=utf-8" %>

<% 
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    Cookie cookie;
    // 아직 util.Cookies.java 파일을 작성하지 않았기 때문에 바닐라 메소드로 사용. 예제와 다르다(p.228)
    if(id.equals(pw)){ // 아이디와 암호가 같으면 로그인 성공한 것으로 판단
        cookie = new Cookie("AUTH",id);
        cookie.setPath("/");
        cookie.setMaxAge(-1);
        response.addCookie(cookie);

    %>
<html>
<head>
<title>
로그인 성공
</title>
</head>
<body>
로그인에 성공했습니다.
</body>
</html>
<%
    } else { // 로그인 실패 시
    %>
<script>
    alert("로그인에 실패했습니다.");
    history.go(-1); // == history.back(); 뒤로가기
</script>
<% } %>