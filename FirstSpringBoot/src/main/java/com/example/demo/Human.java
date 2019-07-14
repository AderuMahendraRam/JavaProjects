package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Without this annotation we can't create the object for class
@Scope(value="prototype") //Will break the singleton feature of spring (more than one object we can create)
public class Human {
	String name;
	String gender;
	int age;
	@Autowired //Select object based on the type
	@Qualifier("autoWiredLaptop")
	private AutoWiredLaptop autoWiredLaptop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public AutoWiredLaptop getAutoWiredLaptop() {
		return autoWiredLaptop;
	}
	public void setAutoWiredLaptop(AutoWiredLaptop autoWiredLaptop) {
		this.autoWiredLaptop = autoWiredLaptop;
	}
	public Human() {
		System.out.println("Human object created");
	}
	public void show() {
		System.out.println("i am in human");
		autoWiredLaptop.show();
	}
	
}
