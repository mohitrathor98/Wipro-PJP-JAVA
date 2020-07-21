package Program2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {

	ArrayList<Employee> list = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return list.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = list.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpid() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : list) {
			if (e.getEmpid() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getSalary();
			}
		}

		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[list.size()];
		for (int i = 0; i < list.size(); i++)
			empArray[i] = list.get(i);
		return empArray;
	}
}
