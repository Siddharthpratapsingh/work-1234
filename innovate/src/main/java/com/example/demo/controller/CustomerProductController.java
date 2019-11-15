package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.customer_product_repo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.demo.model.customer_product;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","created","updates","createdBy","lastupdatedBy"})
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value="/rest/customer_product")
public class CustomerProductController {
	
	@Autowired
	customer_product_repo customer_product_repo;
	
	@GetMapping
	public List<customer_product> getAll()
	{
		return customer_product_repo.findAll();
	}

}
