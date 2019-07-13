package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		/*
		 * Employee eRef = new Employee(); eRef.setEid(1); eRef.setEname("Ram");
		 * eRef.setEaddress("Naidupet"); System.out.println("Details "+ eRef);
		 */
		/*
		 * Resource resource = new ClassPathResource("mapping.xml"); BeanFactory factory
		 * = new XmlBeanFactory(resource);
		 * Employee e = (Employee) factory.getBean("emp");
		 */
		
		context = new ClassPathXmlApplicationContext("mapping.xml");
			
		Employee e = (Employee) context.getBean("emp");
		
		System.out.println("details : "+e);
			
	}

}
