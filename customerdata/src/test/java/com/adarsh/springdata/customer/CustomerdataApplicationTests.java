package com.adarsh.springdata.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adarsh.springdata.customer.entities.Customer;
import com.adarsh.springdata.customer.repos.CustomerRepository;


@SpringBootTest
class CustomerdataApplicationTests {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Adarsh Shivhare");
		customer.setEmail("adarshshivhare456@gmail.com");
		customerRepository.save(customer);
	}
	
	@Test
	public void testRead() {
		Customer customer = customerRepository.findById(1).get();
		assertNotNull(customer);
		assertEquals("Adarsh Shivhare", customer.getName());
	}

	@Test
	public void testUpdate() {
		Customer customer = customerRepository.findById(1).get();
		customer.setEmail("adarsh123@gmail.com");
		customerRepository.save(customer);
	}

	@Test
	public void testDelete() {
		if (customerRepository.existsById(1)) {
			customerRepository.deleteById(1);
		}

	}
	
	@Test
	public void testCount() {
		assertEquals(0, customerRepository.count());
	}
}
