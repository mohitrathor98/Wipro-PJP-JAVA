public class Program3 {
	public static void main(String[] args)
	{
		String inputString="Wipro";
		String finalString="";
		StringBuffer sb=new StringBuffer();
		String firstTwoLetter = sb.append(inputString.substring(0, 2)).toString();
		
		for(int i=0 ; i < inputString.length() ; i++)
		{
			finalString=finalString+firstTwoLetter;
		}
		System.out.print(finalString);
	}
}
