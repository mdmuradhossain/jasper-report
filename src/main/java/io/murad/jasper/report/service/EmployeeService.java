package io.murad.jasper.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.murad.jasper.report.model.Employee;
import io.murad.jasper.report.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
}
