import java.util.Arrays;
public class Program6{
	public static void main(String[] args)
	{
		int[] data = {45,12,85,32,89,39,69,44,42,1,6,8};
		Arrays.sort(data);
		for(int i : data)
		{
			System.out.print(i+" ");
		}
	}

}