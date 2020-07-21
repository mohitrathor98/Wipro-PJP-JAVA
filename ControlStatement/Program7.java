public class Program7{
	public static void main(String[] args)
	{
		char initalizeCharater = 'A';

		if (Character.isLowerCase(initalizeCharater))
		{
			System.out.print(Character.toUpperCase(initalizeCharater));
		}
		else if(Character.isUpperCase(initalizeCharater))
		{
			System.out.print(Character.toLowerCase(initalizeCharater));
		}
	}
}