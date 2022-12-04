package com.ODMT.ODMTBank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ODMT.ODMTBank.dao.BranchDao;
import com.ODMT.ODMTBank.model.Branch;
import com.ODMT.ODMTBank.service.BranchService;
import com.ODMT.ODMTBank.util.CommonUtil;

@Service
@Transactional
public class BranchServiceImpl implements BranchService
{

	@Autowired
	BranchDao branchDao;
	
	@Override
	public boolean createBranch(Branch branch) {
		Branch b = branchDao.save(branch);
		if(CommonUtil.isNull(b))
			return false;
		return true;
	}

	@Override
	public List<Branch> getListOfBranch() {
		return branchDao.findAll();
	}

	@Override
	public boolean editBranch(Branch branch) {
		
		//If ifsc code is changed branch will not be edited.
		Branch databaseBranch = branchDao.findById(branch.getBranchId()).orElse(null);
		if(!databaseBranch.getIfsc().equals(branch.getIfsc()))
			return false;
		
		Branch updateBranch = branchDao.save(branch);
		if(CommonUtil.isNull(updateBranch))
			return false;
		return true;
	}

}