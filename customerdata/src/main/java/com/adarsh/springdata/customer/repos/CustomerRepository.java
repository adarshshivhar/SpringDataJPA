package com.adarsh.springdata.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.adarsh.springdata.customer.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
