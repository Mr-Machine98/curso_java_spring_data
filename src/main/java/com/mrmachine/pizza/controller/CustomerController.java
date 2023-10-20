package com.mrmachine.pizza.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrmachine.pizza.persistence.entity.CustomerEntity;
import com.mrmachine.pizza.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	private final CustomerService customerService;

    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
	
	@GetMapping("/phone/{phone}")
	public ResponseEntity<CustomerEntity> getByPhone(@PathVariable(name = "phone") String phoneNumber){
		return ResponseEntity.ok(this.customerService.findByPhone(phoneNumber));
	}

}
