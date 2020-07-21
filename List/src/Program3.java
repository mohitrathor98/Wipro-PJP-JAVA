import java.util.ArrayList;
import java.util.Iterator;

public class Program3 {
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		Iterator<String> it =list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
