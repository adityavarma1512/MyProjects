package com.prismit.consumingservices.business;

import com.prismit.consumingservices.dto.User;

public interface IUserBusiness {
	public void create(User user);
	public void delete(int id );
	public User findById(int id);
	public User[] getUserList();
}
