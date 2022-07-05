package com.ids.crudex.interfaceService;

import java.util.List;
import java.util.Optional;

import com.ids.crudex.modelo.Employee;

public interface IemployeeService {
	public List<Employee>findAll();
	public Optional<Employee>findById(int id);
	public int save(Employee p);
	public void delete(int id);
	
	

}
