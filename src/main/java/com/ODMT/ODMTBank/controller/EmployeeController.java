package com.ODMT.ODMTBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ODMT.ODMTBank.constant.ODMTConstants;
import com.ODMT.ODMTBank.model.Employee;
import com.ODMT.ODMTBank.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(ODMTConstants.API_VERSION+"employee")
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value = "/create-manager")
	public ResponseEntity<String> createManager(@RequestBody Employee employee,@RequestParam Long branchId)
	{
		boolean flag = employeeService.createManager(employee,branchId);
		if(flag)
			return new ResponseEntity<>("Manager created",HttpStatus.CREATED);
		return new ResponseEntity<>("Failed to add manager",HttpStatus.NOT_FOUND);
	}
}
