package com.arun.mvc.model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.arun.mvc.DTO.EmployeeDTO;
import com.arun.mvc.model.DAO.EmployeeDAO;

@Component
public class EmployeeService 
{
	@Autowired
	private EmployeeDAO dao;
	public EmployeeService() {
		System.out.println("Employee Service Created");
	}
	public void userRegisterService(EmployeeDTO edto)
	{
		System.out.println("Employee Service Started");
		dao.userRegisterDAO(edto);
		System.out.println("Employee Service ended");
	}

}
