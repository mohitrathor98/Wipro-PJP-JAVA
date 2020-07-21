public class Program2{
	public static void main(String[] args)
	{
		int[] data={3,4,1,5,6,7,8,0};

		int max=data[0];
		int min=data[0];
		for(int i=0;i<data.length; i++)
		{
			if(data[i]>max)
			{
				max=data[i];
			}
			else if(data[i]<min)
			{
				min=data[i];
			}
		}
		System.out.println("Maximum element : "+max);
		System.out.print("Minimum element : "+min);
	}
}