import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;
public class Program4 {
	public static void main(String[] args) {
		Logan logan = new Logan("Logan123", "ABC123", "Sarthak", 130, 1);
		
		System.out.println("modelName "+logan.getModelName());
		System.out.println("ownerName "+logan.getOwnerName());
		System.out.println("registrationNumber "+logan.getRegistrationNumber());
		System.out.println("speed "+logan.speed());
		System.out.println("gps(1: gps exist  0: gps not exist) = "+logan.gps());
		
		
		System.out.println();
		
		Ford ford = new Ford("Mustang", "AC1234", "Rishabh", 210, 0);
		
		System.out.println("modelName "+ford.getModelName());
		System.out.println("ownerName "+ford.getOwnerName());
		System.out.println("registrationNumber "+ford.getRegistrationNumber());
		System.out.println("speed "+ford.speed());
		System.out.println("temp control(1: exist  0: not exist) = "+ford.tempControl());
		
		

	}
}
