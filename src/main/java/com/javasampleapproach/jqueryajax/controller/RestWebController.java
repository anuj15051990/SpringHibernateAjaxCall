package com.javasampleapproach.jqueryajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Customer;

@RestController
public class RestWebController {

	List<Customer> cust = new ArrayList<Customer>();

	@RequestMapping(value = "/getallcustomer", method = RequestMethod.GET)
	public Response getResource() {
		Response response = new Response("Done", cust);
		return response;
	}

	@RequestMapping(value = "/postcustomer", method = RequestMethod.POST)
	public Response postCustomer(@RequestBody Customer customer) {
		cust.add(customer);
		Response response = new Response("done", customer);
		return response;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public Response deleteCustomer(@RequestBody Customer customer) {
		cust.add(customer);
		Response response = new Response("done", customer);
		return response;
	}
	
}