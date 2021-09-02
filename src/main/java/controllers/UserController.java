package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import models.User;
import services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userSer;
	@RequestMapping("/users")
	public List<User> getUsersList()
	{
		return userSer.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userSer.getUserById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody User user)
	{
		//System.out.print(topic);
		userSer.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	public void updateUser(@PathVariable int id, @RequestBody User user)
	{
		userSer.updateUser(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userSer.deleteUser(id);
	}
	/*
	@RequestMapping(method = RequestMethod.POST, value = "/users/add")
	public void addAllUsers(List<User> users)
	{
		userSer.addUser(user);
	}
	*/
}
