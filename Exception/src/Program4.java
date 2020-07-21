import java.util.InputMismatchException;

public class Program4 {
	public static void main(String[] args)
	{
		int sum=0;
		double avg=0;
		
		int[] elements=new int[5];
		
		
		try
		{
			elements[0]=Integer.parseInt(args[0]);
			elements[1]=Integer.parseInt(args[1]);
			elements[2]=Integer.parseInt(args[2]);
			elements[3]=Integer.parseInt(args[3]);
			elements[4]=Integer.parseInt(args[4]);
			
			for(int i=0;i<args.length;i++)
			{
				sum=sum+elements[i];
			}
			System.out.println("Sum of elements "+sum);
			avg=sum/5;
			System.out.println("Average of elements "+avg);
		}
		catch(ArithmeticException e)
		{
			System.out.print("ArithmeticException");
		}
		catch(NumberFormatException e)
		{
			System.out.print("NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.print("ArrayIndexOutOfBoundsException ");
		
		}
		
		
		
		
	}
}
