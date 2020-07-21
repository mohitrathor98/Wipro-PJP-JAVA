import com.automobile.Honda;
import com.automobile.twowheeler.Hero;

public class Program3 {

	public static void main(String[] args) {
		Hero hero = new Hero("Apache 160", "ABC123", "Sarthak", 100);
		System.out.println("modelName: " + hero.getModelName());
		System.out.println("ownerName: " + hero.getOwnerName());
		System.out.println("registrationNumber: " + hero.getRegistrationNumber());
		System.out.println("speed: " + hero.speed());
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda", "AB1234", "Rishabh", 120);
		System.out.println("modelName: " + honda.getModelName());
		System.out.println("ownerName: " + honda.getOwnerName());
		System.out.println("registrationNumber: " + honda.getRegistrationNumber());
		System.out.println("speed: " + honda.speed());
		honda.cdplayer();

	}

}
