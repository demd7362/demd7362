<%@ page contentType="text/html; charset=utf-8" %>
<%@ page buffer="1kb" autoFlush="true" %>
<%@ page import="java.util.*" %>
<html>
<head><title>autoFlush 속성값 true 예제</title>
</head>
<body>
<% 
    Random rd = new Random();
    int i;
    int sum = 0;
    %>
<% for(i=0; i<1000; i++){ %>
<% int j = rd.nextInt(101); 
   sum += j;
%> 
<%= j %>
<% } %>
평균 값 = <%= sum/i %>
</body>
</html>