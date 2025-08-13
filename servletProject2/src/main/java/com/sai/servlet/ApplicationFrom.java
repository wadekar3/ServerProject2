package com.sai.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/From")
public class ApplicationFrom extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' type='text/css' href='Style1.css'>"); // Add path to your CSS file
        out.println("</head>");
        out.println("<body>");

        // Retrieve form data
        String empId = request.getParameter("empId");
        String empName = request.getParameter("empName");
        String empAddress = request.getParameter("empAddress");
        String empSalary = request.getParameter("empSalary");
        String gender = request.getParameter("gender");
        String profile = request.getParameter("profile");
        String[] hobbies = request.getParameterValues("hobbies");

        // Generate response
        out.println("<html><body>");
        out.println("<h2>Employee Information:</h2>");
        out.println("<p>Employee Id: " + empId + "</p>");
        out.println("<p>Employee Name: " + empName + "</p>");
        out.println("<p>Employee Address: " + empAddress + "</p>");
        out.println("<p>Employee Salary: " + empSalary + "</p>");
        out.println("<p>Employee Gender: " + gender + "</p>");
        out.println("<p>Employee Profile: " + profile + "</p>");
        out.print("<p>Employee Hobbies: ");
        
        if (hobbies != null) {
            out.print(String.join(", ", hobbies));
        } else {
            out.print("None");
        }
        out.println("</p>");
        out.println("</body></html>");
    }
}

