import java.util.Scanner;
public class Program2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your number : ");

		int number = input.nextInt();

		if (number%2==0)
		{
			System.out.print("Your number is even : "+number);

		}
		else
		{
			System.out.print("Your number is odd :"+number);
		}

	}
}