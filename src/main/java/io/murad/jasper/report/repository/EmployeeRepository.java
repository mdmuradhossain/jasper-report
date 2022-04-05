package io.murad.jasper.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.murad.jasper.report.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    Employee findByPhoneNumber(String phoneNumber);
}
