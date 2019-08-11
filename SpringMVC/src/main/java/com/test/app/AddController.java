package com.test.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int firstValue,@RequestParam("t2") int secondValue) {
		ModelAndView mv = new ModelAndView();
		try {
			
			//By using annotations getting input values.
			//int firstValue = Integer.parseInt(request.getParameter("t1"));
			//int secondValue = Integer.parseInt(request.getParameter("t2"));

			AddService as = new AddService();
			int output = as.add(firstValue, secondValue);

			mv.setViewName("output.jsp");
			mv.addObject("result", output);

			System.out.println("i am calling the add method");

		} catch (Exception e) {
			mv.setViewName("index.jsp");
			mv.addObject("error", "provide proper values");
		}

		return mv;

	}

}
