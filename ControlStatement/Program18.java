public class Program18{
	public static void main(String[] args)
	{
		int n=121;
		int b=Integer.toString(n).length();
		int i=0;
		int temp=n;

		String result="";

		while(i < b)
		{
			result = result + n%10;
			n=n/10;
			i+=1;
		}
		if(Integer.toString(temp).equals(result))
		{
			System.out.print("Number is palindrone");
		}
		else
		{
			System.out.print("Number is not palindrone");
		
		}
	}
}