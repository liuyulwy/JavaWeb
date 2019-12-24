package com.ly.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//此配置等价于 web.xml 中配置
/**
 * Servlet implementation class AServlet
 */
@WebServlet(
		urlPatterns = { "/AServlet" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "value", description = "test")
		})
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setHeader("Content-type", "text/html;charset=UTF-8");  
//		//这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859  
//		response.setCharacterEncoding("UTF-8");
		//相当于上面两句
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		//获取web.xml中的初始化参数
		writer.println("获取初始化参数：" + this.getInitParameter("name"));
		writer.println("获取初始化参数：" + this.getServletContext().getInitParameter("contentname"));
		
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
