package io.murad.jasper.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.murad.jasper.report.model.Employee;
import io.murad.jasper.report.service.EmployeeService;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping()
	public ResponseEntity<List<Employee>> getEmployees(){
		return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> addEmployee(@RequestBody @Valid Employee employee){
		employeeService.saveEmployee(employee);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@GetMapping("/{phoneNumber}")
	public ResponseEntity<Employee> getEmployeeByPhoneNumber(@PathVariable(value="phoneNumber") String phoneNumber){
		return new ResponseEntity<>(employeeService.getEmployeeByPhoneNumber(phoneNumber), HttpStatus.OK);
	}


}
