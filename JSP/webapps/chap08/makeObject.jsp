<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="member" scope="request" class="chap08.member.MemberInfo" />
<%
    member.setId("demd7362");
    member.setName("정지훈");
    %>
<jsp:forward page="/useObject.jsp"/>