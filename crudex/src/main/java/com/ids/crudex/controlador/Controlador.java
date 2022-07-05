package com.ids.crudex.controlador;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ids.crudex.interfaceService.IemployeeService;
import com.ids.crudex.modelo.Employee;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired 
	private IemployeeService service;
	
	
	@GetMapping("listar")
	public String listar(Model model) {
		List<Employee>empleados=service.findAll();
		model.addAttribute("empleados",empleados);
		return "index";
		
		
	}
	

}
