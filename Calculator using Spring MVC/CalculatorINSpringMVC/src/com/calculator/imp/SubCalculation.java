package com.calculator.imp;

public class SubCalculation implements CalculationImp {

	@Override
	public int getValue(int firstValue, int secondValue) {
		return firstValue-secondValue;
	}

}
