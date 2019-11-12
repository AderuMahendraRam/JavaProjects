package com.calculator.pojo;

import java.util.ArrayList;

public class Calculator {
	String firstValue;
	String secondValue;
	String operation;
	String output;
	ArrayList<String> allCalHistory = new ArrayList<>();

	public String getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(String firstValue) {
		this.firstValue = firstValue;
	}

	public String getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(String secondValue) {
		this.secondValue = secondValue;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public ArrayList<String> getAllCalHistory() {
		return allCalHistory;
	}

	public void setAllCalHistory(ArrayList<String> allCalHistory) {
		this.allCalHistory = allCalHistory;
	}
}
