/**
 * 
 */
package spring.di.xmlConf;

/**
 * @author AMRS
 *
 */
public class BaseBall implements Coach {

	private FoodDetails foodDetails;
	public String dailyTimeTable() {
		System.out.println("called baseball coach");
		return "leave early";
	}
	public BaseBall(FoodDetails foodDetails) {
		this.foodDetails=foodDetails;
	}
	
	public String getFoodDetails() {
		return foodDetails.getFoodDetails();
	}


}
