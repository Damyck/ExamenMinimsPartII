<%--
  Created by IntelliJ IDEA.
  User: Marc
  Date: 18/11/2016
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add an Etakemon</title>
    <link href="style.css" rel="stylesheet">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<form action="/addetakemon">
    <br>
    <br>
    <h1 class="header" align="center">New User</h1>
    <p align="center">
        <br>
    <p>User Name</p><input class="entrada" type="text"  name="nickname">
    <p>Name</p><input class="entrada" type="text"  name="name">
    <p>Type</p><input class="entrada" type="text"  name="type">
    <input type="submit" value="Ejecuta">
    </p>
</form>

</body>
</html>
