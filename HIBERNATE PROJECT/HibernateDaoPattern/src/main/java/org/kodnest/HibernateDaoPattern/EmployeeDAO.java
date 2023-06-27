package org.kodnest.HibernateDaoPattern;

import java.util.List;

public interface EmployeeDAO {
	public List<Employee> getEmployees();
	public Employee getEmployeeById(int id);
	public String persistEmployee(Employee obj);
	public String updateEmployee(Employee obj);
	public String deleteEmployee(Employee obj);
	}


