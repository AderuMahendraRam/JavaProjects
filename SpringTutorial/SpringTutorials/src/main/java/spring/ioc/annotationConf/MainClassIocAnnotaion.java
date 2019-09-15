/**
 * 
 */
package spring.ioc.annotationConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AMRS
 *
 */
public class MainClassIocAnnotaion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext = new 
		ClassPathXmlApplicationContext("/spring/ioc/annotationConf/applicationContext.xml");
		Coach coach = applicationContext.getBean("cricetCoach",Coach.class);
		System.out.println(coach.dailyTimeTable());
	}

}
