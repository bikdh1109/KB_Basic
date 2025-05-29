<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 쿼리 파라미터에서 userId, password 받아오기
    String userId = request.getParameter("userId");
    String password = request.getParameter("password");

    // session.Attribute에 저장
    session.setAttribute("userId", userId);
    session.setAttribute("password", password);

    // loginInfo.jsp 로 이동
    response.sendRedirect("loginInfo.jsp");
%>
