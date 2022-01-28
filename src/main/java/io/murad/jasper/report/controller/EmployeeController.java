package io.murad.jasper.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.murad.jasper.report.model.Employee;
import io.murad.jasper.report.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping()
	public ResponseEntity<List<Employee>> getEmployees(){
		return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
	}
}
