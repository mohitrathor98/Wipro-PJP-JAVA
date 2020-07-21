public class Program8
{
	public static void main (String[] args)  
    { 
        int[] data = {1,6,4,7,9};
        int size = data.length;
        int flag=0;

        int idx1=0,idx2=0;
        int total=0;

        for(int i=0 ; i < size ; i++)
        {
            if(data[i]==6)
            {
                for(int j=i ; j < size ; j++)
                {
                    if(data[j]==7 && flag==0)
                    {
                        flag=flag+1;
                        idx1=idx1+i;
                        idx2=idx2+j;

                        for(int k=0 ; k < idx1 ; k++)
                        {
                            total=total+data[k];
                        }
                        for(int k=idx2+1 ; k < size ; k++)
                        {
                            total=total+data[k];
                        }
                        System.out.print(total);
                    }
                }
            }
        }
        if(flag==0)
        {
            for(int l=0;l<size;l++)
            {
                total=total+data[l];
            }
            System.out.print(total);
        }    
    }
}
