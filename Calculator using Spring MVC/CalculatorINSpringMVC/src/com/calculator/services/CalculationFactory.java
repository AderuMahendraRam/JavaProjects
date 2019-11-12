package com.calculator.services;

import com.calculator.imp.AddCalculation;
import com.calculator.imp.CalculationImp;
import com.calculator.imp.DivCalculation;
import com.calculator.imp.MulCalculation;
import com.calculator.imp.SubCalculation;

public class CalculationFactory {

	public CalculationImp getInstance(String operation) {
		CalculationImp ref = null;
		switch(operation) {
		case "+" : ref=new AddCalculation();
					break;
		case "-" : ref =  new SubCalculation();
					break;
		case "*" : ref =  new MulCalculation();
					break;
		case "/" :  ref = new DivCalculation();
					
 		}
		return ref;
	}

}
