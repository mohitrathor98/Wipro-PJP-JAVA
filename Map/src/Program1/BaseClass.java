package Program1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BaseClass {
	HashMap<String,String> H1=new HashMap<>();
	
	public HashMap<String,String> saveCountryCapital(String countryName,String capital)
	{
		H1.put(countryName, capital);
		return H1;
	}
	public String getCapital(String countryName)
	{
		return H1.get(countryName);
	}
	public String getCountry(String capital)
	{
		Set<Entry<String,String>> set=H1.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> m = it.next();
			if(m.getValue().equals(capital))
				return m.getKey();
		}
		return null;
	}
	public HashMap<String, String> reverseKyeValue() {
		HashMap<String, String> H2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = H1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			H2.put(m.getValue(), m.getKey());
		}
		
		return H2;
	}
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = H1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
}
