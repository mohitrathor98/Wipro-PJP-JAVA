public class Program15{
	public static void main(String[] args)
	{
		int n=101001;
		int out,result=0;
		int b=Integer.toString(n).length();

		for(int i=0 ; i<=b ; i++)
		{
			out= n%10;
			result=result+out;
			n=n/10;
		}
		System.out.print("Sum is : "+result);
	}
}