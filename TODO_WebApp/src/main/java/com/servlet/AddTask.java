package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.TodoDAO;
import com.DB.DbConnect;
@WebServlet("/add_task")
public class AddTask extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("task");
	String status = req.getParameter("status");
	
	TodoDAO dao = new TodoDAO(DbConnect.getConnection());
	boolean f =dao.addTask(name, status);
	
	if (f) {
		HttpSession session = req.getSession();
		session.setAttribute("suc", "Task Added...");
		resp.sendRedirect("index.jsp");
		
	}else {
		HttpSession session = req.getSession();
		session.setAttribute("fail", "Something went wrong...");
		resp.sendRedirect("add_task.jsp");
	}
}
}
