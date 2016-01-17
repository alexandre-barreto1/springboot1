package com.example.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.rest.model.Employee;

public class RestClient {

	private static final String ADD_EMPLOYEE = "addEmployee";
	public static final String EMPLOYEE = "employee";
	private String host;
	private RestTemplate restTemplate;

	public RestClient(String host) {
		this.setHost(host);
		setRestTemplate(new RestTemplate());
	}

	public String endpointListEmployee() {
		String url = getHost() + "/" + EMPLOYEE;
		return url;
	}

	public String endpointAddEmployee() {
		String url = getHost() + "/" + ADD_EMPLOYEE;
		return url;
	}

	public Employee[] listEmployee() {

		String url = endpointListEmployee();

		// Executando chamando contra o servidor rest. Colocando que tipo de
		// objeto o listEmployee esta esperando.
		ResponseEntity<Employee[]> responseEntity = getRestTemplate()
				.getForEntity(url, Employee[].class);

		Employee[] body = responseEntity.getBody();

		return body;
	}

	public Employee addEmployee(Employee employee) {

		ResponseEntity<Employee> created = getRestTemplate().postForEntity(
				endpointAddEmployee(), employee, Employee.class);
		Employee body = created.getBody();
		return body;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

}
