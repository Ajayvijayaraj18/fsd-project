package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Payment;
import com.example.demo.Repositories.Paymentrepo;

@Service
public class Paymentservice {

	@Autowired
	private Paymentrepo prorepo;
	
	
	
	public List<Payment> GetPayment() {
		return prorepo.findAll();
	}
	public Payment AddProduct(Payment payment) {
		return prorepo.save(payment);
	}
	public Payment EditProduct(Long id, Payment product) {
		Payment productx = prorepo.findById(id).orElse(null);
		if(productx != null) {
			productx.setPaymentname(product.getPaymentname());
			productx.setPaymenttype(product.getPaymenttype());
			
			return prorepo.saveAndFlush(productx);
		}
		else {
			return null;
		}
	}
	public String DeleteProduct(Long id) {
		if((prorepo.findById(id).orElse(null))!=null) {
			prorepo.deleteById(id);
		return "user deleted "+id;
	}
		else {
			return "can't find user";
		}
	}
	}