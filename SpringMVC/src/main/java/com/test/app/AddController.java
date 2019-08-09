package com.test.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		try {
			int firstValue = Integer.parseInt(request.getParameter("t1"));
			int secondValue = Integer.parseInt(request.getParameter("t2"));
			int output = firstValue+secondValue;			
			mv.setViewName("output.jsp");
			mv.addObject("result", output);
				
			System.out.println("i am calling the add method");
			
		}
		catch(Exception e) {
			mv.setViewName("index.jsp");
			mv.addObject("error", "provide proper values");
		}
		
		
		return mv;
				
	}
	

}
