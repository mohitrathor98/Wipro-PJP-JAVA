
public class Program10 {
	public static void main(String[] args)
	{
		String input="Wipro";
		int n=3;
		String sub;
		sub=input.substring(input.length()-n);
		
		String out="";
		for(int i=0;i<n;i++)
		{
			out=out+sub;
		}
		System.out.print(out);
	}
}
