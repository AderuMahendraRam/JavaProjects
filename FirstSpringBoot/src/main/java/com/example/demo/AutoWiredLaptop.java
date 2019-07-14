package com.example.demo;

import org.springframework.stereotype.Component;

@Component("autoWiredLaptop")
public class AutoWiredLaptop {
	int lid;
	String lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public AutoWiredLaptop() {
		System.out.println("AutoWiredLaptop object created");
	}
	public void show() {
		System.out.println("auto wired method");
	}
	
	
}
