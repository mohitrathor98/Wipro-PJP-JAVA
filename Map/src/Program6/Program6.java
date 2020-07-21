package Program6;

import Program1.BaseClass;

public class Program6 {
	public static void main(String[] args)
	{
		BaseClass b=new BaseClass();
	
		
		System.out.println(b.saveCountryCapital("India", "Delhi"));
		System.out.println(b.saveCountryCapital("Japan", "Tokyo"));
		System.out.println(b.getCapital("India"));
		System.out.println(b.getCountry("Delhi"));
		System.out.println(b.reverseKyeValue());
		System.out.println(b.toArrayList());
	}
}
