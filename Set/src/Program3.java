
import java.util.Iterator;
import java.util.TreeSet;

public class Program3 {
	public static void main(String[] args)
	{
		TreeSet<String> set = new TreeSet<>();
		
		set.add("sarthak");
		set.add("rishabh");
		set.add("vikas");
		set.add("sahil");
		
		Iterator<String> it = set.iterator();
		String query = "vikas";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");
	}
}
