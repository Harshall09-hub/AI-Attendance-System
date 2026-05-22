<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Add Student</title>

<link rel="stylesheet" href="style.css">

</head>

<body>

<div class="container">

<h2>Add Student</h2>

<form action="AddStudentServlet" method="post">

<input type="text"
       name="name"
       placeholder="Enter Student Name"
       required>

<br><br>

<input type="email"
       name="email"
       placeholder="Enter Email"
       required>

<br><br>

<input type="text"
       name="course"
       placeholder="Enter Course"
       required>

<br><br>

<button type="submit">

Add Student

</button>

</form>

</div>

</body>
</html>