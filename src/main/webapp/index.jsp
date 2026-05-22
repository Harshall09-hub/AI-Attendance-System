<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Login Page</title>

<link rel="stylesheet" href="style.css">

</head>

<body>

<div class="container">

<h2>Attendance Management System</h2>

<form action="LoginServlet" method="post">

<input type="text"
       name="username"
       placeholder="Enter Username"
       required>

<br><br>

<input type="password"
       name="password"
       placeholder="Enter Password"
       required>

<br><br>

<button type="submit">

Login

</button>

</form>

</div>

</body>
</html>