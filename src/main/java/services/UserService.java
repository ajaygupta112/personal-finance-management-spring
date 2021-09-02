package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import models.User;
import repositories.UserRepository;

public class UserService {
	@Autowired
	private UserRepository userRepo;
	public List<User> getAllUsers()
	{
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(u->users.add(u));
		return users;
	}
	public User getUserById(int id)
	{
		return userRepo.findById(id).orElse(null);
	}
	public void addUser(User user)
	{
		User newUser = userRepo.save(user);
	}
	public void updateUser(User user)
	{
		userRepo.save(user);
	}
	/*public void addAllUsers(List<User> users)
	{
		userRepo.saveAll(users);
	}*/
	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}
}
