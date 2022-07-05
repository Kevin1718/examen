package com.ids.crudex.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.crudex.modelo.Employee;

@Repository
public interface IEmployee extends CrudRepository <Employee, Integer>{

}
