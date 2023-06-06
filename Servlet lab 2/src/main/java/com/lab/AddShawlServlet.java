package com.lab;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddShawlServlet
 */
@WebServlet("/AddShawlServlet")
public class AddShawlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddShawlServlet() {
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
		
		//retrieve
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String brand = request.getParameter("brand");
		String color = request.getParameter("color");
		String material = request.getParameter("material");
		
		double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		
		//print
		out.println("<!DOCTYPE html><html><body>");
		out.println("Email: " + email + "<br>");
		out.println("Name: " + name + "<br>");
		out.println("Brand: " + brand + "<br>");
		out.println("Color: " + color + "<br>");
		out.println("Material: " + material + "<br>");
		out.println("Price: " + price + "<br>");
		out.println("Quantity: " + quantity + "<br>");
		
		out.println("</body><html>");
		
		
		
		
		
		
		
	}

}
