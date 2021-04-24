package com.dao;

import java.util.List;

public interface EmployeeServiceDAO {

	public int addEmployee(Employee e);

	public int deleteEmployee(Employee e);

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int id);

}
