package edu.tdtu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.tdtu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
