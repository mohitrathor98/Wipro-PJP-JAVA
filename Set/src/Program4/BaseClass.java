package Program4;

import java.util.Iterator;
import java.util.TreeSet;

public class BaseClass {

	TreeSet<String> tree = new TreeSet<>();
	
	public TreeSet<String> saveCountryName(String countryName)
	{
		
		tree.add(countryName);
		
		return tree;
	}
	public String getCountry(String countryName)
	{
		//System.out.println(H1);
		Iterator<String> it = tree.iterator();
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

