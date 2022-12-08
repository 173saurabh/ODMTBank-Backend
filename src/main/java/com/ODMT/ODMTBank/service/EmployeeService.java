package com.ODMT.ODMTBank.service;

import com.ODMT.ODMTBank.model.Employee;

public interface EmployeeService {

	boolean createManager(Employee employee, Long branchId);

}
