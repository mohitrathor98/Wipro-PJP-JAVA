import java.util.Scanner;
public class Program1{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		System.out.print("Enter you number : ");

		int number = input.nextInt();

		if (number < 0)
		{
			System.out.print("Your Number is Negative : "+number);
		}
		else if (number == 0)
		{
			System.out.print("Your Number is Zero : "+number);
		}
		else
		{
			System.out.print("Your Number is Positive : "+number);
		}

	}
}