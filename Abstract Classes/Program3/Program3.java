package Program3;
import java.util.*;
public class Program3 {
	public static void main(String[] args)
	{
		Instrument[] instrument =new Instrument[10];
		Random rand =new Random();
		
		for(int i=0;i<10;i++)
		{
			int randomNumber=rand.nextInt((3-1)+1)+1;
			
			if(randomNumber==1)
			{
				instrument[i]=new Flute();
			}
			else if(randomNumber==2)
			{
				instrument[i]=new Guitar();
			}
			else if(randomNumber==3)
			{
				instrument[i]=new Piano();
			}
			
			instrument[i].play();
		}
		
		for(int i=0;i<10;i++)
		{
			if(instrument[i] instanceof Piano)
			{
				System.out.println("Piano object saved at index "+i+" in instrument array");
			}
			else if(instrument[i] instanceof Guitar)
			{
				System.out.println("Guitar object saved at index "+i+" in instrument array");
			}
			else if(instrument[i] instanceof Flute)
			{
				System.out.println("Flute object saved at index "+i+" in instrument array");
			}
		}
				
	}
}
