package com.crud.services;

import java.util.List;

import com.crud.entities.Emp;

public interface CrudServices {
	
	public Emp create(Emp emp);
	public List<Emp> getAll();
	public Emp getById(Long id);
	public Emp update(Emp emp);
	public void delete(Long id);

}
