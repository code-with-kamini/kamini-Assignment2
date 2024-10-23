package assignment2;

public class Overloading {
	
	int id;
	String name;
	String city;
	String country;
	

	public Overloading (int userId,String userName) {
		
		int id = userId;
		String name = userName;
		System.out.println("id :" +userId);
		System.out.println("name :" +userName);
	}
	
	public Overloading (String userCity,String userCountry) {
		
		String city = userCity;
		String country = userCountry;
		System.out.println("city :" +userCity);
		System.out.println("country :" +userCountry);
		
	}
	

	public static void main(String[] args) {
		
		Overloading over = new Overloading(10 ,"kamini");
	    Overloading over1 = new Overloading("pune","India");
	

	}

}
