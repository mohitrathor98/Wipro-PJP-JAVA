package Program1;

import java.util.HashSet;
import java.util.Iterator;

public class BaseClass {

	HashSet<String> H1=H1=new HashSet<>();
	
	public HashSet<String> saveCountryName(String countryName)
	{
		
		H1.add(countryName);
		
		return H1;
	}
	public String getCountry(String countryName)
	{
		//System.out.println(H1);
		Iterator<String> it = H1.iterator();
		while(it.hasNext())
		{
			if(it.next().equals(countryName))
			{
				return countryName;
			}
		}
		return null;
	}
}


