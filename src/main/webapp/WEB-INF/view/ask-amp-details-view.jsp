<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee details request..</title>
</head>
<body>
<h2>Dear Employee, Pls. enter your details</h2>
<br>
<br>
<form action="showDetails" method="get">
    <input type="text" name="employeeName" placeholder="Write your name.."/>
    <input type="submit"/>
</form>
<br>
<br>
<button onclick="history.back()">Назад</button>
</body>

</html>