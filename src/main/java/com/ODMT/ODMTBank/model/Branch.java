package com.ODMT.ODMTBank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "branch")
@Data
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "branch_id" , nullable = false)
	private Long branchId;
	
	@Column(name = "branch_name" , nullable = false)
	private String branchName;
	
	@Column(name = "ifsc" , nullable = false)
	private String ifsc;
	
	@Column(name = "address" , nullable = false)
	private String address;
}
