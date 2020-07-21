public class Program2 {
	static void concate(String first ,String second) 
	{
		StringBuffer sb=new StringBuffer();
		String firstLower=first.toLowerCase();
		String secondLower=second.toLowerCase();
		
		sb.append(firstLower);
		
		
		if(firstLower.charAt(firstLower.length()-1)==secondLower.charAt(0))
		{
			sb.append(secondLower.substring(1, secondLower.length()));
		}
		else
		{
			sb.append(secondLower);
		}
		System.out.print(sb);
		
	}
	public static void main(String[] args)
	{
		concate("sarthak","Sharma");
	}
}
