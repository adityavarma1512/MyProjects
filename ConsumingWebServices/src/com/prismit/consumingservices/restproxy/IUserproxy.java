package com.prismit.consumingservices.restproxy;

import com.prismit.consumingservices.dto.User;


public interface IUserproxy {
	public void create(User user);
	public void delete(int id );
	public User findById(int id);
	public User[] getUserList();
}
