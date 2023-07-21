package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.Userservice;

@RestController
public class Usercontroller {
	@Autowired
	private Userservice uservice;
	
	
	@GetMapping("/getuser")
	public List<User> GetUsers() {
		return uservice.Getusers();
	}
	@PostMapping("/adduser")
	public User AddUser(@RequestBody User user) {
		return uservice.AddUser(user);
	}
	@PutMapping("/edituser/{id}")
	public User EditUser(@PathVariable Long id, @RequestBody User user) {
		return uservice.EditUser(id, user);
	}
	@DeleteMapping("/deleteuser/{id}")
	public String DeleteUser(@PathVariable Long id) {
		return uservice.DeleteUser(id);
	}
}