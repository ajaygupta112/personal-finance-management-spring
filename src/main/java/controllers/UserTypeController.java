package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.UserType;
import services.UserTypeService;

@RestController
public class UserTypeController {
		
		@Autowired
		private UserTypeService userTySer;
		@RequestMapping("/userType")
		public List<UserType> getAllUsersTypes()
		{
			return userTySer.getAllUsersTypes();
		}
		
		@RequestMapping("/userType/{id}")
		public UserType getUserTypeById(@PathVariable int id)
		{
			return userTySer.getUserTypeById(id);
		}

		@RequestMapping(method = RequestMethod.POST, value = "/userType")
		public void addUserType(@RequestBody UserType userType)
		{
			userTySer.addUserType(userType);
		}
		
		@RequestMapping(method = RequestMethod.PUT, value = "/userType/{id}")
		public void updateUserType(@PathVariable int id, @RequestBody UserType userType)
		{
			userTySer.updateUserType(userType);
		}
		
		@RequestMapping(method = RequestMethod.DELETE, value = "/userType/{id}")
		public void deleteUserType(@PathVariable int id)
		{
			userTySer.deleteUserType(id);
		}
		/*
		@RequestMapping(method = RequestMethod.POST, value = "/users/add")
		public void addAllUsersTypes(List<UserType> usersType)
		{
			userTySer.addUserTypes(userType);
		}
		*/
		
}


