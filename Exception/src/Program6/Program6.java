package Program6;
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner namesc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			
			System.out.println("Enter Student Name");
			
			try {				
				name = namesc.nextLine();
				
				System.out.println("Enter Student Marks");
				
				if (sc.hasNextInt())
					subA = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subB = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subC = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeValuesException();
				if (subA > 100) throw new ValuesOutOfRangeException();
				
				if (subB < 0) throw new NegativeValuesException();
				if (subB > 100) throw new ValuesOutOfRangeException();
				
				if (subC < 0) throw new NegativeValuesException();
				if (subC > 100) throw new ValuesOutOfRangeException();
				
				System.out.println("Name: " + name);
				System.out.println("Marks of subject A: " + subA);
				System.out.println("Marks of subject B: " + subB);
				System.out.println("Marks of subject C: " + subC);
				
				System.out.println("Average marks of "+name+" " + (subA+subB+subC)/3);
				
				
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
			
			
		}
		
		sc.close();

	}
}
