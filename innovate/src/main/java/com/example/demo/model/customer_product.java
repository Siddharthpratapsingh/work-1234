package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_customer_product")
public class customer_product {
	
	@Id
	@GeneratedValue
	private int customer_product_id;
	private int customer_id;
	private int product_id;
	private int price;
	
	
	public customer_product() {
		
	}
	public customer_product(int customer_product_id, int customer_id, int product_id, int price) {
		super();
		this.customer_product_id = customer_product_id;
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.price = price;
	}
	public int getCustomer_product_id() {
		return customer_product_id;
	}
	public void setCustomer_product_id(int customer_product_id) {
		this.customer_product_id = customer_product_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
