package com.calculator.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.calculator.imp.CalculationImp;
import com.calculator.pojo.CalculationHistory;
import com.calculator.pojo.Calculator;
import com.calculator.services.CalculationFactory;

@Component
@RequestMapping("/calculation")
public class ClaculatorController {

	@RequestMapping("/getInput")
	public String getInput(Model model) {

		Calculator cal = new Calculator();

		model.addAttribute("calculator", cal);

		return "calculator";
	}

	@RequestMapping("/showOutput")
	public String showOutput(@ModelAttribute("calculator") Calculator cal) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx;
		
		CalculationFactory calculationFactory = new CalculationFactory();
		try {
			// get Previous Operations from DB
			session = factory.openSession();
			tx=session.beginTransaction();
			List<CalculationHistory> outputList = session.createQuery("FROM CalculationHistory").list();
			Iterator<CalculationHistory> allList = outputList.iterator();
			ArrayList<String> allCalHistory = new ArrayList<>();
			while(allList.hasNext()) {
				CalculationHistory calculation = (CalculationHistory) allList.next();
				allCalHistory.add(calculation.getCalculationData());
				System.out.println(calculation.getId()+ "-->"+calculation.getCalculationData());
			}
			cal.setAllCalHistory(allCalHistory);
	
			int firstValue = Integer.parseInt(cal.getFirstValue());
			int secondValue = Integer.parseInt(cal.getSecondValue());
			String operation = cal.getOperation();
			CalculationImp ref = calculationFactory.getInstance(operation);
			cal.setOutput(ref.getValue(firstValue, secondValue) + "");

			// Save this operation in the DB
			//tx = session.beginTransaction();
			CalculationHistory calculationHistory = new CalculationHistory();
			calculationHistory.setCalculationData(firstValue+operation+secondValue+"="+
			cal.getOutput());
			session.save(calculationHistory);
			tx.commit();
			ModelAndView model = new ModelAndView("output");
			model.addObject("lists",allCalHistory);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("please provide the proper values.");
		}
		return "calculator";
	}
}
