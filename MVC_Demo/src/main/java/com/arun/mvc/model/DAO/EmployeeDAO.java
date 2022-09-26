package com.arun.mvc.model.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.arun.mvc.DTO.EmployeeDTO;

@Component
public class EmployeeDAO 
{
	@Autowired
	private SessionFactory factory;
	public void userRegisterDAO(EmployeeDTO edto)
	{
		System.out.println("Employee DAO Started");
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(edto);
		tx.commit();
		System.out.println("Employee DAO ended");
	}


}
