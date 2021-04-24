package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeServiceDAO {

	public static Map<Integer, Employee> map = new HashMap<Integer, Employee>();

	@Override
	public int addEmployee(Employee e) {
		if (e != null) {
			map.put(e.getId(), e);
			return 1;
		} else {
			return -1;
		}

	}

	@Override
	public int deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		for (Integer id : map.keySet()) {
			list.add(map.get(id));
		}
		return list;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
