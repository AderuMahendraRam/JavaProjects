package spring.di.xmlConf;

public class CricketCoach implements Coach {
	private FoodDetails myFoodDetails;

	public String dailyTimeTable() {
		System.out.println("called cricket coach");
		return "try to wake up early";
	}

	public FoodDetails getMyFoodDetails() {
		return myFoodDetails;
	}

	public void setMyFoodDetails(FoodDetails myFoodDetails) {
		this.myFoodDetails = myFoodDetails;
	}

	@Override
	public String getFoodDetails() {
		return myFoodDetails.getFoodDetails();
	}

}
