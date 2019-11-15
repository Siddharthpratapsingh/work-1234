package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.productRepo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","created","updated","createdBy","lastUpdateBy"})
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value = "/rest/product")
public class ProductController {

	@Autowired
	productRepo productRepo;
	
	 @GetMapping(value = "/all")
	    public List<Product> getAll(){
	        return productRepo.findAll();
	    }

	    @PostMapping(value = "/post")
	    public List<Product> post(@RequestBody Product products){
	        productRepo.save(products);
	        return productRepo.findAll();
	    }
//	    @PutMapping(value = "/update/{particulars}")
//	    public void update(@PathVariable String particulars,@RequestBody Products products){
//	        Products products1 = productRepo.getOne(particulars);
//	        if(products1 == null) {
//	            throw new IllegalStateException("No such product found with name " + particulars);
//	        }
//	        products1.setParticulars(products.getParticulars());
//	        products1.setApplicable_from(products.getApplicable_from());
//	        products1.setHsn_sac(products.getHsn_sac());
//	        products1.setTaxability(products.getTaxability());
//	        products1.setIntegrated_tax(products.getIntegrated_tax());
//	        products1.setCentral_tax(products.getCentral_tax());
//	        products1.setState_tax(products.getState_tax());
//	        products1.setCess(products.getCess());
//	        productRepo.save(products1);
//	    }

//	    @DeleteMapping(value = "/delete/{particulars}")
//	    public void delete(@PathVariable String particulars){
//	        productRepo.deleteById(particulars);
//	    }
}
