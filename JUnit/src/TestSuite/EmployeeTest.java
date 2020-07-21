package TestSuite;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
	
	Employee employee=new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Sarthak");
		list.add("Rishabh");
	}

	@Test
	public void test() {
		assertEquals("Result","FOUND",employee.findName(list,"Sarthak"));
	}

}
