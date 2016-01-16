package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestClientUnitTest {


	@Test
	public void testListEmployeeUrl() throws Exception {

		RestClient client = new RestClient("http://localhost:8080");

		String endpointListEmployee = client.endpointListEmployee();

		String messageDeErro = "O valor do endpoint list employee é diferente do esperado";
		String valorEsperado = "http://localhost:8080" + "/" + "employee";

		assertEquals(messageDeErro, valorEsperado, endpointListEmployee);

	}
}
