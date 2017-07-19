package com.api.aeteris.requestDto;

import java.io.Serializable;

public class RequestDto  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String department;
	String company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}


