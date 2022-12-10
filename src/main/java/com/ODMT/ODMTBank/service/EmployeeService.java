package com.ODMT.ODMTBank.service;

import java.util.List;

import com.ODMT.ODMTBank.model.Employee;

public interface EmployeeService {

	boolean createManager(Employee employee, Long branchId);

	boolean removeBranchManager(Long branchId);

	List<Employee> listOfEmployeesOfABranch(Long branchId);

	List<Employee> listOfCurrentEmployeesOfABranch(Long branchId);

}
