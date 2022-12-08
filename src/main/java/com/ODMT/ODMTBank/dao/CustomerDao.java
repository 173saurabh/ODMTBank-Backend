package com.ODMT.ODMTBank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ODMT.ODMTBank.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>
{

}
