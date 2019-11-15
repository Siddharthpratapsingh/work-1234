package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Customer;
import com.example.demo.repository.customerRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","created","updates","createdBy","lastupdatedBy"})
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value="/rest/customers")
public class CustomerController {

	@Autowired
	customerRepo customerRepo;
	
	@GetMapping(value="/all")
	public List<Customer> getAll(){
		return customerRepo.findAll();
	}
	
	 @PostMapping(value = "/post")
	    public List<Customer> post(@RequestBody Customer customers){
	    	System.out.println(customers.getName());
	        customerRepo.save(customers);
	        return customerRepo.findAll();
	    }
	    
//	    @PutMapping(value="/put/{id1}")
//	    public ResponseEntity<Customer> put(@PathVariable int id1,@RequestBody  Customer customers)
//	    {
//	    	return customerRepo.findById(id1)
//	                .map(Data -> {
//	                    Data.setCategory(customers.getCategory());
//	                    Data.setDiscount(customers.getDiscount());
//	                    Data.setName(customers.getName());
//	                    Data.setPhone(customers.getPhone());
//	                    Data.setCustomer_R(customers.getCustomer_R());
//	                    Customers updatedTodo = customerRepo.save(Data);
//	                    return ResponseEntity.ok().body(updatedTodo);
//	                }).orElse(ResponseEntity.notFound().build());
//	    }
	    @DeleteMapping(value="/customer/{id}")
	    public ResponseEntity<?> deleteTodo(@PathVariable("id") int id) {
	        return customerRepo.findById(id)
	                .map(todo -> {
	                    customerRepo.deleteById(id);
	                    return ResponseEntity.ok().build();
	                }).orElse(ResponseEntity.notFound().build());
	    }
	
}
