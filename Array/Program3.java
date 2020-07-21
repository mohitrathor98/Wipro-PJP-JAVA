import java.util.Scanner;
public class Program3{
	public static void main(String[] args)
	{
		int[] data={1,4,34,56,7};
		int flag=0;
		System.out.print("Enter Element to Search :");
		Scanner input=new Scanner(System.in);
		int searchElement=input.nextInt();

		for(int i=0 ; i<data.length;i++)
		{

			if(data[i] == searchElement)
			{
				System.out.print("Element is present at index : "+i);
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.print("-1");
		}

		

	}

}