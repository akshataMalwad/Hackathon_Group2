package com.hackathonG2.bean;

public class HackethonUser {

	private Long sapId;
	private String name;
	private String email;
	private String skills;
	
	public HackethonUser(Long sapId, String name, String email, String skills) {
		super();
		this.sapId = sapId;
		this.name = name;
		this.email = email;
		this.skills = skills;
	}
	
	public Long getSapId() {
		return sapId;
	}
	public void setSapId(Long sapId) {
		this.sapId = sapId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	
}
