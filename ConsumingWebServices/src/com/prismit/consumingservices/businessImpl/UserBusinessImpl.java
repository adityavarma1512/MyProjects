package com.prismit.consumingservices.businessImpl;

import com.prismit.consumingservices.business.IUserBusiness;
import com.prismit.consumingservices.dto.User;
import com.prismit.consumingservices.restproxyImpl.UserRestproxyImpl;

public class UserBusinessImpl implements IUserBusiness {

	public void create(User user) {
		UserRestproxyImpl userRestproxyImpl = new UserRestproxyImpl();
		userRestproxyImpl.create(user);
		
		
	}

	public void delete(int id) {
		UserRestproxyImpl userRestproxyImpl = new UserRestproxyImpl();
		userRestproxyImpl.delete(id);
		
	}

	public User findById(int id) {
		UserRestproxyImpl userRestproxyImpl = new UserRestproxyImpl();
		//userRestproxyImpl.findById(id);
		return userRestproxyImpl.findById(id);
	}

	public User[] getUserList() {
		UserRestproxyImpl userRestproxyImpl = new UserRestproxyImpl();
		
		return userRestproxyImpl.getUserList();
	}

	}
