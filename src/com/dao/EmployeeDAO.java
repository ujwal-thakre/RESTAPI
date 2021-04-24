package com.dao;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employeeservice")
public class EmployeeDAO {

	
	EmployeeServiceImpl service = new EmployeeServiceImpl();
	
	@GET
	@Path("/employees")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	
	@POST
	@Path("/employees")
	@Produces(MediaType.APPLICATION_XML)
	public int add(@PathParam(value = "id") int id, @PathParam(value = "age") int age,
			@PathParam(value = "name") String name, @PathParam(value = "salary") double salary) {
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setAge(age);
		e.setSalary(salary);
		return service.addEmployee(e);
	}
}
