package spring.ioc.annotationConf;

import org.springframework.stereotype.Component;

@Component("cricetCoach")
public class CricketCoach implements Coach {

	public String dailyTimeTable() {
		System.out.println("called cricket coach");
		return "try to wake up early";
	}

	

}
