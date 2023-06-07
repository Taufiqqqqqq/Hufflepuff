package com.lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PaymentServlet
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
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
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String city = request.getParameter("city");
		int postcode = Integer.parseInt(request.getParameter("postcode"));
		String card = request.getParameter("card");
		int cardnumber = Integer.parseInt(request.getParameter("cardnumber"));
		int cardMonth = Integer.parseInt(request.getParameter("cardMonth"));
		int cardYear = Integer.parseInt(request.getParameter("cardYear"));
		
		out.println("<!DOCTYPE html><html><body>");
		out.println("First Name: " + firstname + "<br>");
		out.println("Last Name: " + lastname + "<br>");
		out.println("Address 1: " + address1 + "<br>");
		out.println("Address 2: " + address2 + "<br>");
		out.println("City: " + city + "<br>");
		out.println("Postcode: " + postcode + "<br>");
		out.println("Card: " + card + "<br>");
		out.println("Card Number: " + cardnumber + "<br>");
		out.println("Card Month: " + cardMonth + "<br>");
		out.println("First Year: " + cardYear + "<br>");
		out.println("</body><html>");
		
		
		
		
		
		
		
		

		
	}

}
