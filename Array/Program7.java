public class Program7
{

	public static void main (String[] args)  
    { 
        int arr[] = {12,34,12,45,67,89}; 
        int n = arr.length; 

        int i,j;

        for (i=0; i < n; i++) 
        { 
            
            for (j=0; j < i; j++) 
            {
            	if (arr[i] == arr[j]) 
                break;
            }
            
              
                     
            if (i == j) 
            System.out.print( arr[i] + " "); 
        } 
  
    }
}
