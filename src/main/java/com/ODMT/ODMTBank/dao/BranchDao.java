package com.ODMT.ODMTBank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ODMT.ODMTBank.model.Branch;

public interface BranchDao extends JpaRepository<Branch, Long>
{

	Branch findByIfsc(String ifsc);

}
