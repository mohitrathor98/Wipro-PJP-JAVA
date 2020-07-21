package Program2;

public class Employee extends Person {
	double anualSalary;
	int yearStarted;
	String insuranceNumber;

	public Employee(String name, double anualSalary, int yearStarted, String insuranceNumber) {
		super(name);
		this.anualSalary = anualSalary;
		this.yearStarted = yearStarted;
		this.insuranceNumber = insuranceNumber;
	}

	public double getAnualSalary() {
		return anualSalary;
	}

	public int getYearStarted() {
		return yearStarted;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	@Override
	public String toString() {
		return "Employee [anualSalary=" + anualSalary + ", yearStarted=" + yearStarted + ", insuranceNumber="
				+ insuranceNumber + ",name=" + name + "]";
	}

}
