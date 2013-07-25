package com.test;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.SpringMVC_1.HomeController;

/**
 * Servlet implementation class AJAXTest_1
 */
public class AJAXTest_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AJAXTest_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("Hello World inside Service");
		response.getWriter().write("test");
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub

		logger.info("do Get called & "+request.toString());
		String name=null;
		  name = "Hello "+request.getParameter("user");
		  String number_1=request.getParameter("number_1");
		  String number_2=request.getParameter("number_2");
		  int i_number_1=new Integer(number_1).intValue();
		  int i_number_2=new Integer(number_2).intValue();
/*		  if(request.getParameter("user").toString().equals("")){
		  name="Hello User : NO NAME";
		  }*/
		  response.setContentType("text/plain");  
		  response.setCharacterEncoding("UTF-8");
		  logger.info("Hello World is GET"+"Request is"+i_number_1+" & "+i_number_2);
		  int i_result=i_number_1+i_number_2;
		  logger.info(""+i_result);
		  response.getWriter().write(""+i_result); 
		 }




	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("do post invoked");
	
			try {
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		logger.info("wait complete");
		
		String s_tempString="<ul class='level-1'><li class='item-i'>I</li><li class='item-ii'>II<ul class='level-2'><li class='item-a'>A</li><li class='item-b'>B<ul class='level-3'><li class='item-1'>1</li><li class='item-2'>2</li><li class='item-3'>3</li></ul></li><li class='item-c'>C</li></ul></li><li class='item-iii'>III</li></ul>";
		response.getWriter().write(s_tempString);
		//throw new ServletException("test Exception");
		
	}

}
