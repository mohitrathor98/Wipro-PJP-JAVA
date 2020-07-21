package Program6;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class BaseClass {
	Hashtable<String,String> H1=new Hashtable<>();
	
	public Hashtable<String,String> saveCountryCapital(String countryName,String capital)
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
	public Hashtable<String, String> reverseKyeValue() {
		Hashtable<String, String> H2 = new Hashtable<String, String>();
		
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
