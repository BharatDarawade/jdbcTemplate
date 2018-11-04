package com.bharat.demo;

public class Address {

	private String city;
	private String pincode;
	
	
	
	public String getCity() {
		return city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
