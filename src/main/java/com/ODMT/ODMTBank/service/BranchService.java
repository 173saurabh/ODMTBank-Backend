package com.ODMT.ODMTBank.service;

import java.util.List;

import com.ODMT.ODMTBank.model.Branch;

public interface BranchService {

	boolean createBranch(Branch branch);

	List<Branch> getListOfBranch();

	boolean editBranch(Branch branch);

}
