package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.capgemini.entity.Order;
import com.capgemini.service.OrderServiceImpl;
import com.capgemini.entity.Customer;

@RestController
@RequestMapping("/updatecustomerinfo")
@CrossOrigin("http://localhost:4200")
public class OrderController {
	
	
	@Autowired
	private OrderServiceImpl orderservice;
	
	
	
	
	@PostMapping("/create")
	public ResponseEntity<String> updateCustomerInfo(@RequestBody Order order)
	{
		
		orderservice.updateCustomerInfo(order);
                
           
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("successfully inserted data",HttpStatus.OK);
		return responseEntity;
					
			}
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer)
	{
                
           
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("successfully inserted data",HttpStatus.OK);
		return responseEntity;
					
					
		
		
				
				
	}
	
	
	
	
	
	}

	
	


