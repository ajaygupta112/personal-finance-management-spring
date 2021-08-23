package services;

import java.util.ArrayList;
import java.util.List;

import models.User;
import repositories.UserRepository;

public class UserTypeService 
{
	UserRepository userRepository;
	
	public List<User> getAllUsers()
	{
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(u->users.add(u));
		return users;
	}
	
	public User getUserById(int id)
	{
		return userRepository.findById(id).orElse(null);
	}

}
