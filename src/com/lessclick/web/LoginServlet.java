package com.lessclick.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lessclick.model.UserJudge;
import com.lessclick.utility.LoginMessage;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException {

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException {

		UserJudge uj = new UserJudge();
		PrintWriter pw = null;
		try {
			pw = res.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String username = req.getParameter("username");
		String password  = req.getParameter("password");
		LoginMessage test = uj.judgeuser(username, password);
		
		if(test.equals(LoginMessage.buyer)){
			try {
				res.sendRedirect("BuyerMainServlet?username="+username+"&password="+password);
			} catch (IOException e) {
				// TODO Auto-generated 	catch block
				e.printStackTrace();
			}
		}else{
			pw.println("<h1>用户名或密码错误，请再试一次，页面将于3秒钟后跳转回主页面</h1>");
			
			try {
				res.sendRedirect("/lessclick/index.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
