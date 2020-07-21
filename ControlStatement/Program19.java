public class Program19{
	public static void main(String[] agrs)
	{
		int total=0;
		int i=0;
		while(total !=5)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				total+=1;
				
			}
			i+=1;
		
		}
	}
}