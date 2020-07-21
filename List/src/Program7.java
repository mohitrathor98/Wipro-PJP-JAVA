import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

class Employee {
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
	
}
public class Program7 {
	public static void main(String a[]){
        Vector<Employee> vct = new Vector<>();
        
        vct.add(new Employee(1,"sarthak",25000.0));
        vct.add(new Employee(2,"rishabh",20000.0));
        vct.add(new Employee(3,"vikas",15000.0));

        
        Enumeration<Employee> enm = vct.elements();
        
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }

}
