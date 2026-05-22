<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AI Attendance Dashboard</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Segoe UI;
}

body{

    background:#0f172a;
    color:white;
    display:flex;
}

/* SIDEBAR */

.sidebar{

    width:250px;
    height:100vh;
    background:#111827;
    padding:25px;
    position:fixed;
}

.sidebar h2{

    text-align:center;
    margin-bottom:40px;
    color:#38bdf8;
}

.sidebar a{

    display:block;
    color:white;
    text-decoration:none;
    padding:15px;
    margin-top:15px;
    border-radius:10px;
    transition:0.3s;
    background:#1e293b;
}

.sidebar a:hover{

    background:#38bdf8;
    transform:translateX(5px);
}

/* MAIN */

.main{

    margin-left:250px;
    width:100%;
    padding:30px;
}

/* TOPBAR */

.topbar{

    display:flex;
    justify-content:space-between;
    align-items:center;
    margin-bottom:30px;
}

.topbar h1{

    font-size:32px;
}

.profile{

    background:#1e293b;
    padding:10px 20px;
    border-radius:12px;
}

/* CARDS */

.cards{

    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
    gap:25px;
}

.card{

    background:#1e293b;
    padding:30px;
    border-radius:20px;
    transition:0.3s;
    box-shadow:0 5px 20px rgba(0,0,0,0.3);
}

.card:hover{

    transform:translateY(-10px);
}

.card h2{

    font-size:40px;
    margin-bottom:10px;
    color:#38bdf8;
}

.card p{

    color:#cbd5e1;
    font-size:18px;
}

/* BUTTONS */

.btn{

    margin-top:20px;
    display:inline-block;
    padding:12px 20px;
    background:#38bdf8;
    color:white;
    border-radius:10px;
    text-decoration:none;
    transition:0.3s;
}

.btn:hover{

    background:#0ea5e9;
}

/* TABLE */

.table-box{

    margin-top:40px;
    background:#1e293b;
    padding:25px;
    border-radius:20px;
}

table{

    width:100%;
    border-collapse:collapse;
    margin-top:20px;
}

table th{

    background:#38bdf8;
    padding:15px;
}

table td{

    padding:15px;
    text-align:center;
    border-bottom:1px solid #334155;
}

/* AI STATUS */

.status{

    margin-top:40px;
    background:#1e293b;
    padding:25px;
    border-radius:20px;
}

.status h3{

    color:#38bdf8;
    margin-bottom:15px;
}

.live{

    color:#22c55e;
    font-weight:bold;
    font-size:20px;
}

</style>

</head>

<body>

<!-- SIDEBAR -->

<div class="sidebar">

    <h2>AI Attendance</h2>

    <a href="dashboard.jsp">Dashboard</a>

    <a href="addStudent.jsp">Add Student</a>

    <a href="ViewStudentServlet">View Students</a>

    <a href="opencvAttendance.jsp">AI Face Attendance</a>
 <a href="ViewAttendanceServlet">
    View Attendance
</a>

</div>

<!-- MAIN CONTENT -->

<div class="main">

    <!-- TOPBAR -->

    <div class="topbar">

        <h1>Modern AI Dashboard</h1>

        <div class="profile">

            Welcome Admin

        </div>

    </div>

    <!-- CARDS -->

    <div class="cards">

        <div class="card">

            <h2>150</h2>

            <p>Total Students</p>

            <a href="ViewStudentServlet" class="btn">
                View
            </a>

        </div>


        <div class="card">

            <h2>AI</h2>

            <p>Face Recognition</p>

            <a href="opencvAttendance.jsp" class="btn">
                Open Camera
            </a>

        </div>

        <div class="card">

            <h2>98%</h2>

            <p>Accuracy</p>

            <a href="#" class="btn">
                Analytics
            </a>

        </div>

    </div>

    <!-- TABLE -->

    <div class="table-box">

        <h2>Today's Attendance</h2>

        <table>

            <tr>

                <th>ID</th>
                <th>Name</th>
                <th>Status</th>
                <th>Time</th>

            </tr>

            <tr>

                <td>1</td>
                <td>Harshal</td>
                <td>Present</td>
                <td>10:30 AM</td>

            </tr>

            <tr>

                <td>2</td>
                <td>Rahul</td>
                <td>Present</td>
                <td>10:32 AM</td>

            </tr>

        </table>

    </div>

    <!-- AI STATUS -->

    <div class="status">

        <h3>AI System Status</h3>

        <p class="live">

            ● Camera Active & Face Detection Running

        </p>

    </div>

</div>

</body>
</html>