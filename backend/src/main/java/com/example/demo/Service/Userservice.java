package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repositories.Userrepo;

@Service
public class Userservice {

	@Autowired
	private Userrepo urepo;
	
	
	
	public List<User> Getusers() {
		return urepo.findAll();
	}
	public User AddUser(User user) {
		return urepo.save(user);
	}
	public User EditUser(Long id, User user) {
		User userx = urepo.findById(id).orElse(null);
		if(userx != null) {
			userx.setName(user.getName());
			userx.setPhone(user.getPhone());
			userx.setPassword(user.getPassword());
			return urepo.saveAndFlush(userx);
		}
		else {
			return null;
		}
	}
	public String DeleteUser(Long id) {
		if((urepo.findById(id).orElse(null))!=null) {
		urepo.deleteById(id);
		return "user deleted "+id;
	}
		else {
			return "can't find user";
		}
	}
	}