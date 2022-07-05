package com.ids.crudex.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.ids.crudex.modelo.Employee;

public interface IEmployee extends CrudRepository <Employee, Integer>{

}
