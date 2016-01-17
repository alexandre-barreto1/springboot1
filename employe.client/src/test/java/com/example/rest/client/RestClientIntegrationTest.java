package com.example.rest.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.rest.model.Employee;

public class RestClientIntegrationTest {

	@Test
	public void testRest01() {

		String host = "http://localhost:8080";

		RestClient client = new RestClient(host);

		//Criando employees 
		Employee employee1 = new Employee("ID1", "Employee1",
				"Porto Alegre");
		Employee employee2 = new Employee("ID2", "Employee2",
				"Porto Alegre");
		Employee employee3 = new Employee("ID3", "Employee3",
				"Porto Alegre");
		Employee employee4 = new Employee("ID4", "Employee4",
				"Porto Alegre");
		Employee employee5 = new Employee("ID5", "Employee5",
				"Porto Alegre");
		
		//Salvando employees no banco de dados
		client.addEmployee(employee1);
		client.addEmployee(employee2);
		client.addEmployee(employee3);
		client.addEmployee(employee4);
		client.addEmployee(employee5);

		//Listando employees
		Employee[] listEmployee = client.listEmployee();

		for (Employee employee : listEmployee) {

			System.out.println(" Employee :" + employee.toString());
		}
		
		assertEquals("Numero de employees esperados não esta correta",5,listEmployee.length);
		
		assertEquals("Nome do primeiro employee nao é o esperado","Employee1", listEmployee[0].getName());
		
	}

}
