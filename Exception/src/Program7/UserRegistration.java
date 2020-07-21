package Program7;

public class UserRegistration {
	void registerUser(String userName,String userCountry) throws InvalidCountryException
	{
		if(userCountry.equals("India"))
		{
			System.out.println("User registration done successfully");
		}
		else
		{
			throw new InvalidCountryException();
		}
	}
	public static void main(String[] args) {
	
		UserRegistration registration = new UserRegistration();
		
		try {
			registration.registerUser("Mickey", "US");
			
		} catch (InvalidCountryException e) {
			
		}
	}
}
