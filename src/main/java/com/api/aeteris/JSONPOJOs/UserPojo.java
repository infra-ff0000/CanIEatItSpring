/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.JSONPOJOs;

import java.util.Arrays;


/**
 *
 * @author ariazavocki
 */

@javax.ws.rs.Path("user/info/{userId}")
public class UserPojo {

    private int userId ;
    

	private String restrictions;

	// private String email;
	private String[] allergens;

	private String name;

	private String age;

	public int getuserId() {

		return userId;
	}

	public void setId(int userId) {

		this.userId = userId;

	}

	public String getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}

	/*
	 * public String getEmail () { return email; }
	 * 
	 * public void setEmail (String email) { this.email = email; }
	 */
	public String[] getAllergens() {
		return allergens;
	}

	public void setAllergens(String[] allergens) {
		this.allergens = allergens;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ClassPojo [restrictions = " + restrictions + ", allergens = " + Arrays.toString(allergens) + ", name = "
				+ name + ", age = " + age + "]";
	}
}



                  
