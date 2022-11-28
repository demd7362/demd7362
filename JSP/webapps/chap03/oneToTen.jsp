<%@ page contentType="text/html; charset=utf-8" %>
<html>
    <head><title>1-10까지의 합</title></head>
    <body>
        <%
            int n = 10;
            int sum = n*(n+1)/2;
        %>
        1부터 10까지의 합은 <%= sum %> 입니다
    </body>
</html>