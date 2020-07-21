package Program4;

import Program1.BaseClass;

public class Program4 {
	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		
		b.saveCountryName("India");
		b.saveCountryName("America");
		b.saveCountryName("Canada");
		
		System.out.println(b.getCountry("India"));
		System.out.println(b.getCountry("America"));
		System.out.println(b.getCountry("Australia"));

	}

}
