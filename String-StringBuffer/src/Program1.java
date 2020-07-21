
public class Program1 {
	public static void main(String[] args)
	{
		String inputString ="121";
		String reversedString="";
		
		StringBuffer sb=new StringBuffer();
		sb.append(inputString);
		
		reversedString = sb.reverse().toString();
		
		if (inputString.equals(reversedString))
		{
			System.out.print("Palindrone");
		}
		else
		{
			System.out.print("Not Palindrone");
		}
	}
}
