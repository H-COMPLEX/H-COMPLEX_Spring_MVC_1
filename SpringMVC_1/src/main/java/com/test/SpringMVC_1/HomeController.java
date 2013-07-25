package com.test.SpringMVC_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		String l_viewPage = "jquery_1";
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		//Session l_sesion = 
		//ServletRequest l_request = session.getSer
	//RequestContextUtils.getWebApplicationContext(ServletRequest request);
		
		
		model.addAttribute("serverTime", formattedDate );
		logger.info("Controller used is " +l_viewPage+" & method used is GET");
		logger.info("class is : "+(this.getClass()).toString());
		return l_viewPage;	
	}
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home_1(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String l_viewPage = "home_GET";
		
		String formattedDate = dateFormat.format(date);
		//Session l_sesion = 
		//ServletRequest l_request = session.getSer
		//RequestContextUtils.getWebApplicationContext(ServletRequest request);
		
		
		model.addAttribute("serverTime", formattedDate );
	
		model.addAttribute("test_field", "Hello This is new !! & JSP used is "+l_viewPage);
		model.addAttribute("testcase","home");
		
		
		
		logger.info("Controller used is " +l_viewPage+" & method used GET.");
		return l_viewPage;
		
				
		
	}
	
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String home_2(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String l_viewPage = "home_POST";
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
	
		model.addAttribute("test_field", "Hello This is new !! & JSP used is "+l_viewPage);
		model.addAttribute("testcase","home");
		
		logger.info("Controller used is " +l_viewPage+", method used POST");
		return l_viewPage;		
	}
	
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(Locale locale, Model model) {
		String l_viewPage = "welcome";
		logger.info("Controller used is " +l_viewPage);
		return l_viewPage;	
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String welcome_1(Locale locale, Model model) {
		String l_viewPage = "welcome";
		logger.info("Controller used is " +l_viewPage+ "method used is POST");
		return l_viewPage;
	}
	
	
}
