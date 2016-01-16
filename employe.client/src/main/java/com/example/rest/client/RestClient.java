package com.example.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.rest.model.Employee;

public class RestClient {

    public static final String EMPLOYEE = "employee";
    private String host;
    private RestTemplate restTemplate;
    public RestClient(String host){
        this.setHost(host);
        setRestTemplate(new RestTemplate());
    }

    public Employee[] listEmployee(){

        String url = endpointListEmployee();

        ResponseEntity<Employee[]> responseEntity = getRestTemplate().getForEntity(url, Employee[].class);

        Employee[] body = responseEntity.getBody();

        return body;
    }

	public String endpointListEmployee() {
		String url = getHost() + "/"+EMPLOYEE;
		return url;
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
