

import java.util.HashSet;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("sarthak");
		set.add("rishabh");
		set.add("vikas");
		set.add("sahil");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}


}
