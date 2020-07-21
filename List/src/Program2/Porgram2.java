package Program2;

public class Porgram2 {

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(1, "sarthak", "sarthak@gmail.com", 'M', 25000);
		Employee emp2 = new Employee(2, "rishabh", "rishabh@gmail.com", 'M', 30000);
		Employee emp3 = new Employee(3, "vikas", "vikas@gmail.com", 'M', 20000);
		Employee emp4 = new Employee(4, "sahil", "sahil@gmail.com", 'M', 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
		{
			System.out.println(emp.getEmployeeDetails());
		}
			
		
		System.out.println();
		empDb.deleteEmployee(4);
		
		for (Employee emp : empDb.listAll())
		{
			System.out.println(emp.getEmployeeDetails());
		}		
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(1));
	}

}
