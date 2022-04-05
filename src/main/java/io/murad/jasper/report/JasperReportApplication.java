package io.murad.jasper.report;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.murad.jasper.report.model.Employee;
import io.murad.jasper.report.repository.EmployeeRepository;

@SpringBootApplication
public class JasperReportApplication {

	@Autowired
	private EmployeeRepository employeeRepository;
	 
	public static void main(String[] args) {
		SpringApplication.run(JasperReportApplication.class, args);

	}
	
	@PostConstruct
	public void addEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("Murad");
		employee.setLastName("Hossain");
		employee.setEmail("murad@gmail.com");
		employee.setPhoneNumber("01676761068");
		employee.setHireDate(LocalDateTime.now());
		employee.setSalary(20000.00);
		employeeRepository.save(employee);

		Employee employee2 = new Employee();
		employee2.setFirstName("Shovon");
		employee2.setLastName("Khan");
		employee2.setEmail("shvon@gmail.com");
		employee2.setPhoneNumber("01676761069");
		employee2.setHireDate(LocalDateTime.now());
		employee2.setSalary(20000.00);
		employeeRepository.save(employee2);

		Employee employee3 = new Employee();
		employee3.setFirstName("Rubel");
		employee3.setLastName("Khan");
		employee3.setEmail("shvon@gmail.com");
		employee3.setPhoneNumber("01676761059");
		employee3.setHireDate(LocalDateTime.now());
		employee3.setSalary(20000.00);
		employeeRepository.save(employee3);
	}

}
