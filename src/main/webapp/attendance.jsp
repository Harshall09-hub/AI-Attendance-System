<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Attendance Page</title>

<link rel="stylesheet" href="style.css">

</head>

<body>

<div class="container">

<h2>Mark Attendance</h2>

<form action="AttendanceServlet"
      method="post">

<input type="number"
       name="student_id"
       placeholder="Enter Student ID"
       required>

<br><br>

<input type="date"
       name="date"
       required>

<br><br>

<select name="status">

<option value="Present">

Present

</option>

<option value="Absent">

Absent

</option>

</select>

<br><br>

<button type="submit">

Submit Attendance

</button>

</form>

</div>

</body>
</html>