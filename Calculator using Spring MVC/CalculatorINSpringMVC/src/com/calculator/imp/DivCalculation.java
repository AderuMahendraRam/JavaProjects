package com.calculator.imp;

public class DivCalculation implements CalculationImp {

	@Override
	public int getValue(int firstValue, int secondValue) {
		return firstValue/secondValue;
	}

}
