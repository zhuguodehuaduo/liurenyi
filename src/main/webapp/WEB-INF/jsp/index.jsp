<%--
  Created by IntelliJ IDEA.
  User: liurenyi
  Date: 2019/12/21
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <table border="1">
       <tr>
           <td>id</td>
           <td>name</td>
       </tr>
       <c:forEach items="list" var="stu">
           <tr>
               <td>${stu.id}</td>
               <td>${stu.name}</td>
           </tr>
       </c:forEach>
   </table>
</body>
</html>
