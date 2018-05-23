package com.prismit.consumingservices.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable  {

   /**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;
   
	
	int 	userid; 
	String firstname; 
	String lastname;
	String emailid; 
	String phoneno;
	
	private List<Address> addressList = new ArrayList<Address>();
	
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", phoneno=" + phoneno + ", addressList=" + addressList + "]";
	}
	public User(int userid, String firstname, String lastname, String emailid, String phoneno) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.phoneno = phoneno;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public void add(Address address) {
		addressList.add(address);
		address.setUser(this);
	}
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public void addList(List<Address> address) {
		Iterator<Address> addressList = this.getAddressList().iterator();
		while(addressList.hasNext()) {
		Address address1=addressList.next();
		address1.setUser(this);
	}
	}
	
	
	
} 
