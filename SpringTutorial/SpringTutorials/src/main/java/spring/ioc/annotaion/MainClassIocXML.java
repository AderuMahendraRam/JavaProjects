/**
 * 
 */
package spring.ioc.annotaion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AMRS
 *
 */
public class MainClassIocXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/ioc/annotaion/applicationContext.xml");
		Coach coach = applicationContext.getBean("cricket",Coach.class);
		System.out.println(coach.dailyTimeTable());
		coach = applicationContext.getBean("baseball",Coach.class);
		System.out.println(coach.dailyTimeTable());
		
		//closing resources
		applicationContext.close();
		
		
	}

}
