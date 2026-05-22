package com.attendance;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AttendanceServlet")

public class AttendanceServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        int studentId =
                Integer.parseInt(
                        request.getParameter("student_id"));

        String date =
                request.getParameter("date");

        String status =
                request.getParameter("status");

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(

                    "INSERT INTO attendance(student_id,attendance_date,status) VALUES(?,?,?)"

                    );

            ps.setInt(1, studentId);

            ps.setString(2, date);

            ps.setString(3, status);

            int i = ps.executeUpdate();

            if(i > 0) {

                response.getWriter().println(
                        "Attendance Saved Successfully");

            } else {

                response.getWriter().println(
                        "Attendance Failed");
            }

        } catch(Exception e) {

            response.getWriter().println(e);
        }
    }
}