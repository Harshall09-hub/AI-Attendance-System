package com.attendance;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddStudentServlet")

public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO students(name,email,course) VALUES(?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);

            int i = ps.executeUpdate();

            if(i > 0) {

                response.getWriter().println(
                        "Student Added Successfully");

            } else {

                response.getWriter().println(
                        "Failed To Add Student");
            }

        } catch(Exception e) {

            response.getWriter().println(e);
        }
    }
}