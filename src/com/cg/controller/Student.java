package com.cg.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@Size(min=2, max=10)
	private String name;
	@NotNull
	private String email;

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
	
	
}
