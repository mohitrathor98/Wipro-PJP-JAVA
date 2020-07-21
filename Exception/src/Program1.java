import java.util.*;
public class Program1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String input = sc.nextLine();
		
		try
		{
			int num= Integer.parseInt(input);
			System.out.println("The Square Value is "+Math.pow(num,2));
			System.out.println("The work has been done Successfully");
		}
		catch(Exception e)
		{
			System.out.println("Enter input is not a valid format for an Integer");
		}
	}
}
