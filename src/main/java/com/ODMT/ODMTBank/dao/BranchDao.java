package com.ODMT.ODMTBank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ODMT.ODMTBank.model.Branch;

public interface BranchDao extends JpaRepository<Branch, Long>
{

}
