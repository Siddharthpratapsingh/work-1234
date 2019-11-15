package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_product")
public class Product {
	
	@Id
	@GeneratedValue
	private int product_id;
	private String particulars;
	private String applicable_form;
	private String hsn_sac;
	private String taxability;
	private int integrated_tax;
	private int central_tax;
	private int state_tax;
	private String cess;
	private int price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String particulars, String applicable_form, String hsn_sac, String taxability,
			int integrated_tax, int central_tax, int state_tax, String cess, int price) {
		super();
		this.product_id = product_id;
		this.particulars = particulars;
		this.applicable_form = applicable_form;
		this.hsn_sac = hsn_sac;
		this.taxability = taxability;
		this.integrated_tax = integrated_tax;
		this.central_tax = central_tax;
		this.state_tax = state_tax;
		this.cess = cess;
		this.price = price;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getApplicable_form() {
		return applicable_form;
	}
	public void setApplicable_form(String applicable_form) {
		this.applicable_form = applicable_form;
	}
	public String getHsn_sac() {
		return hsn_sac;
	}
	public void setHsn_sac(String hsn_sac) {
		this.hsn_sac = hsn_sac;
	}
	public String getTaxability() {
		return taxability;
	}
	public void setTaxability(String taxability) {
		this.taxability = taxability;
	}
	public int getIntegrated_tax() {
		return integrated_tax;
	}
	public void setIntegrated_tax(int integrated_tax) {
		this.integrated_tax = integrated_tax;
	}
	public int getCentral_tax() {
		return central_tax;
	}
	public void setCentral_tax(int central_tax) {
		this.central_tax = central_tax;
	}
	public int getState_tax() {
		return state_tax;
	}
	public void setState_tax(int state_tax) {
		this.state_tax = state_tax;
	}
	public String getCess() {
		return cess;
	}
	public void setCess(String cess) {
		this.cess = cess;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} 
	
	

}
