package com.example.projects.userservice.model;

public class Users {

	private String id;
	private String name;
	private String emailid;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String id, String name, String emailid) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.emailid = emailid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}
