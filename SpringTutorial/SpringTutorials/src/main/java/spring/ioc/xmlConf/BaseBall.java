/**
 * 
 */
package spring.ioc.xmlConf;

/**
 * @author AMRS
 *
 */
public class BaseBall implements Coach {

	public String dailyTimeTable() {
		System.out.println("called baseball coach");
		return "leave early";
	}


}
