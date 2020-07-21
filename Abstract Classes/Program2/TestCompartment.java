package Program2;
import java.util.Random;

public class TestCompartment {
	
	
	public static void main(String[] args)
	{
		Compartment[] compartment =new Compartment[10];
		
		Random rand=new Random();
				
		for(int i=0 ;i<10 ;i++)
		{
			int randomNumber = rand.nextInt((4 - 1) + 1) + 1; // ((max - min)+1) + min
			
			if(randomNumber == 1)
			{
				compartment[i]=new FirstClass();
			}
			else if(randomNumber == 2)
			{
				compartment[i]=new General();
			}
			else if(randomNumber == 3)
			{
				compartment[i]=new Ladies();
			}
			else if(randomNumber == 4)
			{
				compartment[i]=new Luggage();
			}
			
			compartment[i].notice();
			System.out.println("");
		}
	}

}
