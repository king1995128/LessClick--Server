package com.lessclick.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lessclick.model.UserJudge;
import com.lessclick.utility.LoginMessage;

public class BuyerMainServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException {
		PrintWriter pw = null;
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		try {
			pw = res.getWriter();
			pw.println("<p1>welcom</p1></br>");
			pw.println("<p1>"+username+"</p1></br>");
			pw.println("<p1>"+password+"</p1></br>");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException {
	}

}
