import java.util.*;
public class Program9 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 2 number ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try
		{
			int quotient=a/b;
			System.out.println("The quotient of "+a+"/"+b+" = "+quotient);
		}
		catch(ArithmeticException e)
		{
			System.out.println("DivideByZeroException caught");
		}
		finally
		{
			System.out.print("Inside finally block");
		}
	}
}
