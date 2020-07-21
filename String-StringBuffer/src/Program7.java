
public class Program7 {
	public static void main(String[] args)
	{
		String input="xhix";
	
		if(input.charAt(0)=='x')
		{
			input=input.substring(1,input.length());
		}
		if(input.charAt(input.length()-1)=='x')
		{
			input=input.substring(0,input.length()-1);
		}
		System.out.print(input);
	}
}
