package com.ODMT.ODMTBank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ODMT.ODMTBank.dao.BranchDao;
import com.ODMT.ODMTBank.dao.EmployeeDao;
import com.ODMT.ODMTBank.model.Branch;
import com.ODMT.ODMTBank.model.Employee;
import com.ODMT.ODMTBank.service.EmployeeService;
import com.ODMT.ODMTBank.util.CommonUtil;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	BranchDao branchDao;
	
	@Override
	public boolean createManager(Employee employee, Long branchId) {
		
		//Finding if manager exist in the branch as employee_type = manager & active = true & branch id:-
		Employee emp = employeeDao.findByEmployeeTypeAndActiveAndBranchBranchId("manager",true,branchId);
		
		if(CommonUtil.isNotNull(emp))
			return false;
		
		Branch branch = branchDao.findById(branchId).orElse(null);
		if(CommonUtil.isNull(branch))
			return false;
		
		employee.setBranch(branch);
		employee.setPassword(CommonUtil.generatePassword(8));
		emp = employeeDao.save(employee);
		
		if(CommonUtil.isNull(emp))
			return false;
		
		return true;
	}

	@Override
	public boolean removeBranchManager(Long branchId) {
		
		Employee emp = employeeDao.findByEmployeeTypeAndActiveAndBranchBranchId("manager", true, branchId);
		if(CommonUtil.isNull(emp))
			return false;
		
		emp.setActive(false);
		emp = employeeDao.save(emp);
		
		if(emp.getActive()==false)
			return true;
		return false;
	}

	@Override
	public List<Employee> listOfEmployeesOfABranch(Long branchId) {
		List<Employee> employees = employeeDao.findByBranchBranchId(branchId);
		return employees;
	}

	@Override
	public List<Employee> listOfCurrentEmployeesOfABranch(Long branchId) {
		List<Employee> employees = employeeDao.findByBranchBranchIdAndActive(branchId,true);
		return employees;
	}
}
