package com.crud.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entities.Emp;
import com.crud.repo.CrudRepo;
import com.crud.services.CrudServices;

@Service
public class CrudServicesImpl implements CrudServices{

	@Autowired
	private CrudRepo crudRepo;
	
	@Override
	public Emp create(Emp emp) {
		System.out.println("Name : "+emp.getName()); 
		return crudRepo.save(emp);
	}

	@Override
	public List<Emp> getAll() {
		return crudRepo.findAll();
	}

	@Override
	public Emp update(Emp emp) {
		return crudRepo.save(emp);
	}

	@Override
	public void delete(Long id) {
		crudRepo.deleteById(id);
	}

	@Override
	public Emp getById(Long id) {
		return crudRepo.findById(id).get();
	}

}
