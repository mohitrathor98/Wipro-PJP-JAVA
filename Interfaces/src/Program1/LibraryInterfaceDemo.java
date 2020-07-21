package Program1;

public class LibraryInterfaceDemo {
	public static void main(String[] args)
	{
		KidUsers kidUsers =new KidUsers(10,"Kids");
		kidUsers.registerAccount();
		kidUsers.requestBook();
		
		AdultUsers adultUsers =new AdultUsers(13,"Fiction");
		adultUsers.registerAccount();
		adultUsers.requestBook();
		
		KidUsers kidUsers2 =new KidUsers(13,"Fiction");
		kidUsers2.registerAccount();
		kidUsers2.requestBook();
		
		AdultUsers adultUsers2 =new AdultUsers(13,"Kids");
		adultUsers2.registerAccount();
		adultUsers2.requestBook();
		
		
		
		
	}
}
