<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.io.*" %>
<%@ page import = "java.net.URL" %>
<html>
<head>
<title>
application 기본 객체 사용하여 자원 읽기2
</title>
</head>
<body>
<%
    String resourcePath = "/message/notice.txt";
    char[] buff = new char[128];
    int len = -1;
    URL url = application.getResource(resourcePath);
    try(
        InputStreamReader isr = new InputStreamReader(url.openStream(),"UTF-8")
    ) {
        while( (len = isr.read(buff)) != -1){
            out.print(new String(buff,0,len));
        }
    } catch (Exception e) {
        out.print("익셉션 발생 " + e.getMessage());
    } %>
</body>
</html>