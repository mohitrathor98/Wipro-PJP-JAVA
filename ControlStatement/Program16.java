public class Program16{
	public static void main(String[] args)
	{
		int n = 1;
		while(n <=Integer.parseInt(args[0]))
		{
			for(int i=1; i <= n ; i++)
			{
				System.out.print("*");
			}

			System.out.println();

			n=n+1;
		}
	}
}