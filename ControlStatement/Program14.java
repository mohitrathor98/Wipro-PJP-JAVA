public class Program14{
	public static void main(String[] args)
	{
		int i,flag=0;

		if(args.length == 0)
		{
			System.out.print("Please enter an integer number");
		}
		else
		{
			int n=Integer.parseInt(args[0]);
			int m=n/2;

			if(n==0 || n==1)
			{
				System.out.print(n+" is not prime number nor composite");
			} 
			else
			{
				for(i=2 ; i < m ; i++)
				{
					if(n%i==0)
					{
						System.out.println(n+" is not prime number");      
						flag = 1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println(n+" is prime number");      
				}
			}

		}

		
	}
}