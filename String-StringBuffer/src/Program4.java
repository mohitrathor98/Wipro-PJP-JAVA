public class Program4 {
	static String FirstHalf(String input,int length)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(input);
		if(length%2==0)
		{
			String out = sb.substring(0,length/2);
			return out;
		}
		else
		{
			return "null";
		}
	}
	public static void main(String[] args)
	{
		String input="sarthaks";
		System.out.print(FirstHalf(input,input.length()));
	}
}
