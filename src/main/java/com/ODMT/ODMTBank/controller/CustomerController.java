package com.ODMT.ODMTBank.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ODMT.ODMTBank.constant.ODMTConstants;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(ODMTConstants.API_VERSION+"customer")
public class CustomerController {

}
