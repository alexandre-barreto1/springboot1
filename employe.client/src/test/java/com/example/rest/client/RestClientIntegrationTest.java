package com.example.rest.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.rest.model.Employee;

public class RestClientIntegrationTest {

	@Test
	public void testRest01() {

		String host = "http://localhost:8080";

		RestClient client = new RestClient(host);

		Employee[] listEmployee = client.listEmployee();

		for (Employee employee : listEmployee) {

			System.out.println(" Employee :" + employee.toString());
		}
	}

}
