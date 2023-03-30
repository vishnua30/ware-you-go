package com.bosch.whms.service;

import java.util.List;

import com.bosch.whms.model.User;

public interface UserService{
	 public List<User> getAllUsers();

	    public User getUserById(int id);

	    public void addUser(User user);

	    public void updateUser(User user);

	    public void deleteUser(int id);

}
