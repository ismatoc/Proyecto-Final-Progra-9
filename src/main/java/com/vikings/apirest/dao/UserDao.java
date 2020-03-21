package com.vikings.apirest.dao;
import java.util.List;

import com.vikings.apirest.Entity.User;

public interface UserDao {
	public List<User> findAll();
	
	public User findById(int id);
	
	public void save (User user);
	
	public void delete (int id);
	

}
