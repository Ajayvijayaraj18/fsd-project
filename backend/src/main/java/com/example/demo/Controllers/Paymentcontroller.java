package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Payment;
import com.example.demo.Service.Paymentservice;

@RestController
public class Paymentcontroller {
	@Autowired
	private Paymentservice provice;
	
	
	@GetMapping("/getpro")
	public List<Payment> GetPayment() {
		return provice.GetPayment();
	}
	@PostMapping("/addpro")
	public Payment AddPayment(@RequestBody Payment payment) {
		return provice.Addpayment(payment);
	}
	@PutMapping("/editpro/{id}")
	public Payment EditProduct(@PathVariable Long id, @RequestBody Payment payment) {
		return provice.EditPayment(id, payment);
	}
	@DeleteMapping("/deletepro/{id}")
	public String DeletePayment(@PathVariable Long id) {
		return provice.DeletePayment(id);
	}
}