package com.prismit.consumingservices.dto;

import java.io.Serializable;


public class Address  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private User user;
	int addressid;
	String streetname;
	String housenumber;
	String city; 
	String state; 
	int zipcode; 
	public Address() {
		super();
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Address [user=" + user + ", addressid=" + addressid + ", streetname=" + streetname + ", housenumber="
				+ housenumber + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}	

}
