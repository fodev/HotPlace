package com.place.domain;

public class UserDomain {
	private String userid;
	private String pwd;
	private String name;
	private String gender;
	
	public UserDomain(String userid, String pwd, String name, String gender) {
		super();
		this.userid = userid;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
	}

	public String getUserId() {
		return userid;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
	
	
}
