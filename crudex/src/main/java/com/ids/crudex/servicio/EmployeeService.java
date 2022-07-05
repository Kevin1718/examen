package com.ids.crudex.servicio;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ids.crudex.interfaceService.IemployeeService;
import com.ids.crudex.interfaces.IEmployee;
import com.ids.crudex.modelo.Employee;

@Service
public class EmployeeService implements IemployeeService {
	@Autowired
	private IEmployee data;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return (List<Employee>)data.findAll();	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Employee p) {
		// TODO Auto-generated method stub
		int res=0;
		Employee employee =data.save(p);
		if(!employee.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
