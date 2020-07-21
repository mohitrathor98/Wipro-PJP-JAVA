
public class Program8 {
	public static void main(String[] args)
	{
		String input="absa*cd";
		int indexOfAsterisk=0;
		for(int i=0 ; i<input.length();i++)
		{
			if (input.charAt(i)=='*')
			{
				indexOfAsterisk=i;
			}
		}
		System.out.print(input.substring(0,indexOfAsterisk-1)+input.substring(indexOfAsterisk+2,input.length()));
	}
}
