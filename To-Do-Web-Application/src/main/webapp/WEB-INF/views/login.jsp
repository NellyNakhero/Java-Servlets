<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP For To-Do</title>
</head>
<body>
<h1>Hey ${name}, Your To-do List </h1>

<br/>
save password? ${password}
<br/>
<form action="/login.do" method="post">
Enter Your Name: <input type="text" name="name">

<input type="submit">
</form>


</body>
</html>