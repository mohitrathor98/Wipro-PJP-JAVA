public class Program1{
	public static void main(String[] args)
	{
		float total=0;
		int[] data={1,2,3,4,5,6};
		for(int i =0;i<=data.length;i++)
		{
			total=total+i;
		}
		System.out.println("Sum : "+total);
		System.out.print("Average : "+total/data.length);
	}
}