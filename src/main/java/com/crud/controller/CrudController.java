package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entities.Emp;
import com.crud.services.CrudServices;

@RestController
@RequestMapping("/crud")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CrudController {
	
	@Autowired
	private CrudServices crudServices;
	
	@PostMapping
	public Emp create(@RequestBody Emp emp) {
		System.out.println("Name in controller "+emp.getName()); 
		return crudServices.create(emp);
	}
	
	@GetMapping
	public List<Emp> getAll(){
		return crudServices.getAll();
	}
	
	@GetMapping("/{id}")
	public Emp getById(@PathVariable Long id) {
		return crudServices.getById(id);
	}
	
	@PutMapping
	public Emp update(@RequestBody Emp emp) {
		return crudServices.update(emp);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		crudServices.delete(id);
	}

}
