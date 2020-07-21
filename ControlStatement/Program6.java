import java.util.Scanner;
public class Program6{
	public static void main(String[] args)
	{
	
		int age=Integer.parseInt(args[0]);
		String gender=args[1];

		if(gender.equals("Female") && (age >=1 && age<=58))
		{
			System.out.print("percentage of interest is 8.2%");
		}
		else if(gender.equals("Female") && (age >=59 && age<=100))
		{
			System.out.print("percentage of interest is 9.2%");
		}
		else if(gender.equals("Male") && (age >=1 && age<=58))
		{
			System.out.print("percentage of interest is 8.4%");
		}
		else if(gender.equals("Male") && (age >=59 && age<=100))
		{
			System.out.print("percentage of interest is 10.5%");
		}

	}
}