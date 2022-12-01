<%@ page contentType="text/html; charset=utf-8" %>
    
<% 
    // Cookies cookies = new Cookies(request); // cookies.java 파일 미완이므로 나중에 다시 코딩
    
    %>

<html>
<head>
<title>
로그인 여부 검사
</title>
</head>
<body>
<% 
    Cookie[] cookies = request.getCookies();
    if(cookies.length > 0){
        for(int i=0; i<cookies.length; i++){
            if(!(cookies[i].getName().equals("AUTH"))){
                cookies[i].setPath("/");
                cookies[i].setMaxAge(0);
                response.addCookie(cookies[i]);
            } 
        }
    }
    if(cookies != null){
        out.println(cookies[0].getName()+"로 로그인한 상태");
    }
    %>
</body>
</html>