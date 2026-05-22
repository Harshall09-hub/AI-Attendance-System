<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>AI Face Attendance</title>

<style>

body{

    margin:0;
    padding:0;
    font-family:Segoe UI;
    background:#0f172a;
    color:white;
    text-align:center;
}

.container{

    margin-top:100px;
}

h1{

    font-size:40px;
    color:#38bdf8;
}

p{

    font-size:20px;
    color:#cbd5e1;
}

.btn{

    margin-top:30px;
    padding:15px 30px;
    background:#38bdf8;
    color:white;
    border:none;
    border-radius:10px;
    font-size:18px;
    cursor:pointer;
    transition:0.3s;
}

.btn:hover{

    background:#0ea5e9;
}

</style>

</head>

<body>

<div class="container">

    <h1>AI Face Attendance</h1>

    <p>
        OpenCV Face Detection System Ready
    </p>

    <button class="btn"
        onclick="alert('Run FaceDetection.java from Eclipse')">

        Start AI Camera

    </button>

</div>

</body>
</html>