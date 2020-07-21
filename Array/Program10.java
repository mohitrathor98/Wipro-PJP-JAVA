public class Program10
{
	public static void main (String[] args)  
    { 

        if(args.length<9)
        {
            System.out.print("Please enter 9 integer numbers");
        }
        else
        {
            String[][] arr ={ {args[0],args[1],args[2]},{args[3],args[4],args[5]},{args[6],args[7],args[8]}};

            int max=Integer.parseInt(args[0]);

            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(arr[i][j]+" ");
                    if(Integer.parseInt(arr[i][j])>max)
                    {
                        max=Integer.parseInt(arr[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.print("The biggest number in the given array is : "+max);
            


        }
        



    }
}
