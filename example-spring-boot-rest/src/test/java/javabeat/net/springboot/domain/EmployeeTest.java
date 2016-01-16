package javabeat.net.springboot.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEmployee() {
	
		Employee employee=new Employee("1", "2", "3");
		
		String valorEncontrado = employee.toString();
	
		String valorEsperado = "Employee{id=1, name=2, 3=3}";
		
		assertEquals("toString é diferente do valor esperado",valorEsperado,valorEncontrado);
	
	}
}
