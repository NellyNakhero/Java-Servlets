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

<p style="color:red"> ${errorMessage}</p>
<form action="/login.do" method="post">

Name: <input type="text" name="name">
<br/>

Password: <input type="password" name="password">
<br/>

<br/>
<br/>

<input type="submit" >
</form>


</body>
</html>