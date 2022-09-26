package com.arun.mvc.DTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Entity
@Table(name="emp_table")
public class EmployeeDTO implements Serializable
{
	@Id
	@GenericGenerator(name="ref", strategy="increment")
	@GeneratedValue(generator="ref")
	private int id;
	private String name;
	private String emailid;
	
	public EmployeeDTO() {
	System.out.println("Employee Created");
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
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
