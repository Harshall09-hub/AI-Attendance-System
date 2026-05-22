package com.attendance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;

public class AutoAttendance {

    public static void markAttendance(String name) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO face_attendance(student_name, attendance_date, attendance_time, status) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);

            ps.setDate(2,
                    java.sql.Date.valueOf(
                            LocalDate.now()));

            ps.setTime(3,
                    java.sql.Time.valueOf(
                            LocalTime.now()));

            ps.setString(4, "Present");

            ps.executeUpdate();

            System.out.println(
                    "Attendance Marked Successfully");

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}