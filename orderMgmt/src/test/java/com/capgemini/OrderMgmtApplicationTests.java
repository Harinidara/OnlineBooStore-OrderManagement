package com.capgemini;

//import org.junit.jupiter.api.Test;
import java.net.URISyntaxException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.capgemini.entity.Customer;

import java.net.URI;
import org.junit.Test;

@SpringBootTest
class OrderMgmtApplicationTests {

	@SuppressWarnings({ "unused" })
	@Test
	public void addCustomer() throws URISyntaxException{
		
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + 8874 + "/updatecustomerinfo/add";
	    URI uri = new URI(baseUrl);
	    
	    Customer customer=new  Customer();
	    customer.setCustomerId("12365789");
	    customer.setCustomerName("Harini");
	    customer.setMobileNumber("7013972588");
	    customer.setAddress("Near APGVB Bank");
	    customer.setCity("Kothagudem");
	    customer.setZipCode("507166");
	    customer.setCountry("India");
		
	}

}
