package com.prismit.consumingservices.restproxyImpl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.prismit.consumingservices.dto.User;
import com.prismit.consumingservices.restproxy.IUserproxy;

public class UserRestproxyImpl implements IUserproxy {

	RestTemplate restTemplate = new RestTemplate();
	@Override
	public void create(User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<User> request = new HttpEntity<User>(user);
		restTemplate.exchange("http://localhost:8082/user", HttpMethod.POST,request,String.class);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(int id) {
		User user = restTemplate.getForObject("http://localhost:8082/user/"+id,User.class);
		return user;
	}

	@Override
	public User[] getUserList() {
		ResponseEntity<User[]> responseEntity = restTemplate.getForEntity("http://localhost:8082/user",User[].class);
		User[] userList = responseEntity.getBody();
		return userList;
	}

}
