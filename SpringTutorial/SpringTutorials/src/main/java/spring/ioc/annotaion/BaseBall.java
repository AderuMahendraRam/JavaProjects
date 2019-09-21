/**
 * 
 */
package spring.ioc.annotaion;

import org.springframework.stereotype.Component;

/**
 * @author AMRS
 *
 */
@Component("baseball")
public class BaseBall implements Coach {

	public String dailyTimeTable() {
		System.out.println("called baseball coach");
		return "leave early";
	}


}
