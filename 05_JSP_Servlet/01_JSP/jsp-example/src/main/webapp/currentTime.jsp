<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>현재 날짜 출력 실습</h2>
<p>현재 날짜 :
<%
  Date now = new Date();
  out.println(now.toString());
%>
</p>
</body>
</html>
