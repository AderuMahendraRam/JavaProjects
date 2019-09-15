/**
 * 
 */
package spring.ioc.annotationConf;

import org.springframework.stereotype.Component;

/**
 * @author AMRS
 *
 */
@Component("baseballCoach")
public class BaseBall implements Coach {

	public String dailyTimeTable() {
		System.out.println("called baseball coach");
		return "leave early";
	}


}
