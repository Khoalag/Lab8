package edu.tdtu.service;

import java.util.List;

import edu.tdtu.entity.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee saveEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
	public Employee updateEmployee(Employee employee);
	void deleteEmployeeById(Long id);
}
