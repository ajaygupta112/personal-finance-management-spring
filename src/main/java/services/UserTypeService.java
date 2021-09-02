package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import models.UserType;

import repositories.UserTypeRepository;

public class UserTypeService 
{
	@Autowired
	private UserTypeRepository userTypeRepo;
	public List<UserType> getAllUsersTypes()
	{
		List<UserType> usersType = new ArrayList<>();
		userTypeRepo.findAll().forEach(u->usersType.add(u));
		return usersType;
	}
	public UserType getUserTypeById(int id)
	{
		return userTypeRepo.findById(id).orElse(null);
	}
	public void addUserType(UserType userType)
	{
		UserType newUserType = userTypeRepo.save(userType);
	}
	public void updateUserType(UserType userType)
	{
		userTypeRepo.save(userType);
	}
	/*public void addAllTopic(List<IncomeTransaction> incTrans)
	{
		itr.saveAll(incTrans);
	}*/
	public void deleteUserType(int id)
	{
		userTypeRepo.deleteById(id);
	}
}
