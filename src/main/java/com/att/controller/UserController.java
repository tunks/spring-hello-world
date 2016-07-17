package com.att.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.att.model.User;
import com.att.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UserService userService ;
	
    @RequestMapping(method = RequestMethod.GET)
	public List<User> getAll(){
		return userService.allUsers();
	}
	
    @RequestMapping(method = RequestMethod.POST)
	public User addUser(User user){
		return userService.addUser(user);
	}
    
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id){
		userService.deleteUser(id);
	}

	
	
	
}
