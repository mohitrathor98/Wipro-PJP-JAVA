package Program2;

public class Employee {
	int empid;
	String empName;
	String email;
	char gender;
	float salary;
	

	public Employee(int empid, String empName, String email, char c, float salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.email = email;
		this.gender = c;
		this.salary = salary;
	}
	

	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getEmployeeDetails() {
		return "Employee id : "+empid+" Employee Name : "+empName+" Email : "+email+" Gender : "+gender+" Salary : "+salary;
	}
	
	
}
