package com.ODMT.ODMTBank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ODMT.ODMTBank.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long>
{

	Employee findByEmployeeTypeAndActiveAndBranchBranchId(String string, boolean b, Long branchId);

	List<Employee> findByBranchBranchId(Long branchId);

}
