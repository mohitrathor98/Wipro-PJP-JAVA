public class Program9
{
	public static void main (String[] args)  
    { 
        

        if(args.length < 4)
        {
            System.out.print("Please enter 4 integer numbers");
        }
        else
        {
            String[][] arr = { { args[0], args[1] }, { args[2], args[3] } }; 

            System.out.println("The given array is : ");
            for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(arr[i][j] + " "); 
            } 
            System.out.println();
        }   
        System.out.println("The reverse of the array is : ");

        for (int k = 1; k >=0; k--) { 
            for (int l = 1; l>=0; l--) { 
                System.out.print(arr[k][l] + " "); 
            } 
            System.out.println();
        }   
        
        }
    }
}
