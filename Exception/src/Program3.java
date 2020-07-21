import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args)
	{
		System.out.println("Enter number of elements in array");
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		
		int[] elements=new int[arraySize];
		
		System.out.println("Enter elements in array");
		
		
		try
		{
			for(int i=0;i<arraySize;i++)
			{
				elements[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
		
			int index=sc.nextInt();
			
			System.out.println("The array element at index "+index+" = "+elements[index]);
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} 
		catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		sc.close();
	}
}
