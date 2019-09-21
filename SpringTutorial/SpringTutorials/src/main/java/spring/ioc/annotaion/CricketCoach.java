package spring.ioc.annotaion;

import org.springframework.stereotype.Component;

@Component("cricket")
public class CricketCoach implements Coach {

	public String dailyTimeTable() {
		System.out.println("called cricket coach");
		return "try to wake up early";
	}

	

}
