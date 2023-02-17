package com.ThinkifyLabs.CabBookingApp.Repositories;

import java.util.HashMap;
import java.util.Map;

import com.ThinkifyLabs.CabBookingApp.Entities.User;

public class UserRepository {

	private Map<String,User> userList;
	
	public UserRepository()
	{
		userList = new HashMap<>();
	}
	
	public boolean userExists(String name) 
	{
        return userList.containsKey(name);
    }
	
	public void addUser(User user)
	{
		userList.put(user.getName(),user);
	}
}
