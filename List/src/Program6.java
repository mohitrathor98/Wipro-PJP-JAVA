import java.util.Vector;

public class Program6 {
	public static void main(String[] args)
	{
		Vector<String> months=new Vector<>();
		
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		for(int i=0;i<12;i++)
		{
			System.out.println(months.get(i));
		}
	}
}

