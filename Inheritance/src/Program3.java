import java.util.Scanner;
public class Program3 {
	public static void main(String args[])
	{
     
		Teacher t=new Teacher("Rajeev","24-05-1985",25000,"Maths");
		t.get_details();
		CollegeStudents c=new CollegeStudents("Rahul", "12-03-1996", "xyz Engineering College", "4th year", "1a264521");
		c.get_details();
	}
}
class Person{
	
	String name;
	String dob;
	
}

class Teacher extends Person{
	int salary;
	String subject;
	Teacher(String name,String dob,int salary,String subject)
	{
		this.name=name;
		this.dob=dob;
		this.salary=salary;
		this.subject=subject;
	
	}
	void get_details()
	{

		System.out.println("Teacher Name is "+name+" dob "+dob+" salary "+salary+" subjects "+subject);	
	}
	
}
class Students extends Person
{
	String studentId;

}

class CollegeStudents extends Students{
	String collegeName;
	String year;
	public CollegeStudents(String name,String dob,String collegeName,String year,String studentId) {
		this.name=name;
		this.dob=dob;
		this.collegeName=collegeName;
		this.year=year;
		this.studentId=studentId;
		
	}
	
	void get_details()
	{
		System.out.println("CollegeStudent Name is "+name+" dob "+dob+" collegeName "+collegeName+" year "+year+" studentsId "+studentId);
		
	}
	
}