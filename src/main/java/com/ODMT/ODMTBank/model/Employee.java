package com.ODMT.ODMTBank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "employee_id" , nullable = false)
	private Long employeeId;
	
	@Column(name = "name" , nullable = false)
	private String name;
	
	@Column(name = "password" , nullable = false)
	private String password;
	
	@Column(name = "email" , nullable = false)
	private String email;
	
	@Column(name = "mobile" , nullable = false)
	private String mobile;
	
	@Column(name = "employee_type" , nullable = false)
	private String employeeType;
	
	@ManyToOne
	@JoinColumn(name = "branch_id", referencedColumnName = "branch_id", nullable = true)
	private Branch branch;
}
