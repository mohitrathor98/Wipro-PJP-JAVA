import java.util.LinkedList;

public class Program5 {
	public static void main(String[] args)
	{
		LinkedList<String> months = new LinkedList<String>(); 
		  
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
