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
@Table(name = "customer")
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "customer_id" , nullable = false)
	private Long customerId;
	
	@Column(name = "odmt_id" , nullable = false)
	private String odmt_id;
	
	@Column(name = "email" , nullable = false)
	private String email;
	
	@Column(name = "mobile" , nullable = false)
	private String mobile;
	
	@Column(name = "acc_no" , nullable = false)
	private Long accNo;
	
	@Column(name = "name" , nullable = false)
	private String name;
	
	@Column(name = "password" , nullable = false)
	private String password;
	
	@Column(name = "pan" , nullable = false)
	private String pan;
	
	@Column(name = "address" , nullable = false)
	private String address;
	
	@Column(name = "state" , nullable = false)
	private String state;
	
	@Column(name = "pincode" , nullable = false)
	private Long pincode;
	
	@Column(name = "dob" , nullable = false)
	private String dob;
	
	@Column(name = "aadhar" , nullable = false)
	private Long aadhar;

	@ManyToOne
	@JoinColumn(name = "branch_id", referencedColumnName = "branch_id", nullable = true)
	private Branch branch;
}



















