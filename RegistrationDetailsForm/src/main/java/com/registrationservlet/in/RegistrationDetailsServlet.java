package com.registrationservlet.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrationdao.in.RegistrationDao;
import com.registrationmodel.in.LoginModel;
import com.registrationmodel.in.RegistrationDetailsModel;

@WebServlet("/")
public class RegistrationDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegistrationDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();
		switch(path)
		{
			case "/Insert":insertLogin(request, response); 
			break;
			case "/Validate":validateLogin(request, response);
			break;
			case "/RegisterData":registerData(request, response);
			break;
			default:getLoginPage(request, response);
			break;
		}
	}

	private void registerData(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void insertLogin(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		RegistrationDetailsModel rdm = new RegistrationDetailsModel(name, email, password, mobile, gender, city);
		RegistrationDao rd = new RegistrationDao();
		rd.insertRegistration_Details(rdm);
		
		RequestDispatcher grd = request.getRequestDispatcher("Home.jsp");
		try {
			grd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PrintWriter out = response.getWriter();
			out.println("<div style='width:600px;margin:auto;margin-top:50px;'>");
			out.println("<br><br><br><br><br><br>");
			out.println("<table class='table table-hover table-striped' "
					+ "border='2' cellspacing='2' align='center' "
					+ "style='background-color:teal;color:black;border:5px solid red'>");
			out.println("<tr align='center'>");
			out.println("<td>Full_Name:</td>");
			out.println("<td>"+name+"</td>");
			out.println("</tr>");
			
			out.println("<tr align='center'>");
			out.println("<td>Email_Id:</td>");
			out.println("<td>"+email+"</td>");
			out.println("</tr>");
			
			out.println("<tr align='center'>");
			out.println("<td>Password:</td>");
			out.println("<td>"+password+"</td>");
			out.println("</tr>");
			
			out.println("<tr align='center'>");
			out.println("<td>Mobile_Number:</td>");
			out.println("<td>"+mobile+"</td>");
			out.println("</tr>");
			
			out.println("<tr align='center'>");
			out.println("<td>Gender:</td>");
			out.println("<td>"+gender+"</td>");
			out.println("</tr>");
			
			out.println("<tr align='center'>");
			out.println("<td>City:</td>");
			out.println("<td>"+city+"</td>");
			out.println("</tr>");
			
			out.println("</table>");
			out.println("</div>");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void validateLogin(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		LoginModel lm = new LoginModel(email, password);
		
		RegistrationDao rd = new RegistrationDao();
		String check = rd.checkLogin(lm);
		
		if(check.equals("Success"))
		{
			RequestDispatcher grd = request.getRequestDispatcher("Controller.jsp");
			try {
				grd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			RequestDispatcher grd = request.getRequestDispatcher("index.jsp");
			try {
				grd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private void getLoginPage(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
