package com.ODMT.ODMTBank.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ODMT.ODMTBank.constant.ODMTConstants;
import com.ODMT.ODMTBank.model.Branch;
import com.ODMT.ODMTBank.service.BranchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(ODMTConstants.API_VERSION+"branch")
public class BranchController 
{
	@Autowired
	BranchService branchService;
	
	@PostMapping(value = "/create-branch")
	public ResponseEntity<String> createBranch(@RequestBody Branch branch)
	{
		boolean b = branchService.createBranch(branch);
		if(b)
			return new ResponseEntity<>("Branch created",HttpStatus.CREATED);
		return new ResponseEntity<>("Failed to create branch",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value = "/get-list-of-branch")
	public ResponseEntity<List<Branch>> getListOfBranch()
	{
		List<Branch> branches = branchService.getListOfBranch();
		return new ResponseEntity<>(branches,HttpStatus.OK);
	}
}
