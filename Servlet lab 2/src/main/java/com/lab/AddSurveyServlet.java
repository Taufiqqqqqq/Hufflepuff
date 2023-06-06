package com.lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddSurveryServlet
 */
@WebServlet("/AddSurveyServlet")
public class AddSurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSurveyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String donated = request.getParameter("donated");
		String times = request.getParameter("times");
		
		String[] reason = request.getParameterValues("reason");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html><html><body>");
		
		out.print("Please indicate your gender: " + gender + "<br>");
		out.print("What is your age: " + age + "<br>");
		out.print("Have you ever donated blood: " + donated + "<br>");
		out.print("If yes, how many times within the last 2 years: " + times + "<br>");
		out.print("What prompted you to donate blood: <br> ");
		
		if (reason !=null) {
			for (int i=0; i<reason.length; i++){
				out.println(reason[i] + "<br>");
			}
			//int and double
		}
		out.print("</body><html>");
	}

}
