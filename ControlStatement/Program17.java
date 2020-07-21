public class Program17{
	public static void main(String[] args)
	{
		int n=123456;
		int b=Integer.toString(n).length();
		int i=0;

		String result="";

		while(i < b)
		{
			result = result + n%10;
			n=n/10;
			i+=1;
		}
		System.out.print(result);
	}
}