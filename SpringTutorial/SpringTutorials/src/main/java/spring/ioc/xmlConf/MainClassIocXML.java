/**
 * 
 */
package spring.ioc.xmlConf;

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
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/ioc/xmlConf/applicationContext.xml");
		Coach coach = applicationContext.getBean("cricketCoach",Coach.class);
		System.out.println(coach.dailyTimeTable());
		coach = applicationContext.getBean("baseball",Coach.class);
		System.out.println(coach.dailyTimeTable());
	}

}
