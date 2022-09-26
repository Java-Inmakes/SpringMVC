package com.arun.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arun.mvc.DTO.EmployeeDTO;
import com.arun.mvc.model.Service.EmployeeService;
@Controller
@RequestMapping("/")
public class EmpController 
{
	@Autowired
	private EmployeeService ser;
	public EmpController() {
	System.out.println("Employee Controller created");
	}
	@RequestMapping(value="register.do", method=RequestMethod.POST)
	public ModelAndView userRegisterController(EmployeeDTO edto)
	{
		System.out.println("Employee Controller Started");
		ser.userRegisterService(edto);
		System.out.println("Employee Controller ended");
		return new ModelAndView("/Success.jsp");
	}

}
