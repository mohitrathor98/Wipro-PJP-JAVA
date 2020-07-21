import java.util.Scanner;
public class Program8{
	public static void main(String[] agrs)
	{

		System.out.print("Enter color code : ");
		
		Scanner input =new Scanner(System.in);
		char colorCode = input.next().charAt(0);


		switch(colorCode)
		{
			case 'R' :
				System.out.print("Red");
				break;

			case 'B' :
				System.out.print("Blue");
				break;

			case 'G' :
				System.out.print("Green");
				break;

			case 'O' :
				System.out.print("Orange");
				break;

			case 'Y' :
				System.out.print("Yellow");
				break;

			case 'W' :
				System.out.print("white");
				break;

			default:
				System.out.print("Invalid Color");
		}
	}
}