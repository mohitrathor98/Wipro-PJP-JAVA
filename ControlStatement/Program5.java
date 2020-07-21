public class Program5{
	public static void main(String[] args){
		char initialValue='a';

		if(Character.isDigit(initialValue))
		{
			System.out.print("Digit");
		}
		else if (Character.isLetter(initialValue))
		{
			System.out.print("Alphabhet");
		}
		else
		{
			System.out.print("Special Character");	
		}
	}
}