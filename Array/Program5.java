import java.util.Arrays;
public class Program5{
	public static void main(String[] args)
	{
		int[] data = {45,12,85,32,89,39,69,44,42,1,6,8};
		int lenOfArray=data.length;
		Arrays.sort(data);
		System.out.println("Largest two number in array : "+data[lenOfArray-1]+" and "+data[lenOfArray-2]);
		System.out.print("Smallest two number in array : "+data[0]+" and "+data[1]);
	}

}