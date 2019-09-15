/**
 * 
 */
package spring.di.xmlConf;

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
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext = new 
		ClassPathXmlApplicationContext("/spring/di/xmlConf/applicationContext.xml");
		Coach coach = applicationContext.getBean("cricketCoach",Coach.class);
		System.out.println(coach.dailyTimeTable());
		System.out.println(coach.getFoodDetails());
		coach = applicationContext.getBean("baseball",Coach.class);
		System.out.println(coach.dailyTimeTable());
		System.out.println(coach.getFoodDetails());
		
	}

}
