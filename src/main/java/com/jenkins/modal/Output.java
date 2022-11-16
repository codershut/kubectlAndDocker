package com.jenkins.modal;

import javax.validation.constraints.NotEmpty;

public class Output  {
	
	@NotEmpty(message = "Invalid fname")
	private String first_name;
	@NotEmpty(message = "Invalid Lname")
	private String last_name;
	private String email;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "{\"first_name\":\""+first_name+"\",\"last_name\":\""+last_name+"\",\"email\":\""+email+"\"}";
	}
	
	

	
//	@Override
//	public String toString() {
//		return "{\r\n"
//				+ "    \"first_name\": +first_name+,"
//				+ "    \"last_name\": +last_name+,"
//				+ "    \"email\": +email+"
//				+ "}";
//	}
	
	

}
