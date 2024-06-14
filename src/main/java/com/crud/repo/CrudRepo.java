package com.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entities.Emp;

@Repository
public interface CrudRepo extends JpaRepository<Emp, Long> {

}
