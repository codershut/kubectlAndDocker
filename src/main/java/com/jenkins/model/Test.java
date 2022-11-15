package com.jenkins.model;

public class Test {
	
	private String name;
	private String status;
	private String dpt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public Test(String name, String status, String dpt) {
		super();
		this.name = name;
		this.status = status;
		this.dpt = dpt;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", status=" + status + ", dpt=" + dpt + "]";
	}

}
