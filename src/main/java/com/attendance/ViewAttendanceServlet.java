package com.attendance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewAttendanceServlet")

public class ViewAttendanceServlet extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)

            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");

        out.println("<head>");

        out.println("<style>");

        out.println("body{font-family:Segoe UI;background:#0f172a;color:white;padding:30px;}");

        out.println("table{width:100%;border-collapse:collapse;background:#1e293b;}");

        out.println("th,td{padding:15px;border:1px solid #334155;text-align:center;}");

        out.println("th{background:#38bdf8;}");

        out.println("h1{margin-bottom:20px;}");

        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Attendance Records</h1>");

        out.println("<table>");

        out.println("<tr>");

        out.println("<th>ID</th>");
        out.println("<th>Student Name</th>");
        out.println("<th>Date</th>");
        out.println("<th>Time</th>");
        out.println("<th>Status</th>");

        out.println("</tr>");

        try {

            Connection con =
                    DBConnection.getConnection();

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(
                    "SELECT * FROM face_attendance");

            while(rs.next()) {

                out.println("<tr>");

                out.println("<td>"
                        + rs.getInt("id")
                        + "</td>");

                out.println("<td>"
                        + rs.getString("student_name")
                        + "</td>");

                out.println("<td>"
                        + rs.getDate("attendance_date")
                        + "</td>");

                out.println("<td>"
                        + rs.getTime("attendance_time")
                        + "</td>");

                out.println("<td>"
                        + rs.getString("status")
                        + "</td>");

                out.println("</tr>");
            }

        } catch(Exception e) {

            out.println(e);
        }

        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }
}