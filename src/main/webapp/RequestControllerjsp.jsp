<%@ page import="com.LibBookCo.BookLibrary.controller.ResultOBJ" %>
<%@ page import="com.LibBookCo.BookLibrary.controller.RequestController" %>

<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 12/30/2018
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <%RequestController requestController = new RequestController(request);%>
  <%=request.getRealPath(request.getServletPath())%>
  <%ResultOBJ resultOBJ = requestController.getResult();%>
</head>
<body>

</body>
</html>
