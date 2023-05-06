<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="Write your name.."/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>
<%--@elvariable id="employee" type=""--%>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/> <!--GET name-->
    <br>
    <br>
    Surname <form:input path="surname"/> <!--GET surname-->
    <br>
    <br>
    Salary <form:input path="salary"/> <!--GET salary-->
    <br>
    <br>
    Department <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Humar Resources" label="HR"/>--%>
<%--    <form:option value="Sales department" label="SALES"/>--%>
    <form:options items="${employee.departmentsList}"/>
</form:select>
    <input type="submit" value="OK"/> <!--тут срабатывают сеттеры-->
</form:form>
<button onclick="history.back()">Back</button>
</body>

</html>