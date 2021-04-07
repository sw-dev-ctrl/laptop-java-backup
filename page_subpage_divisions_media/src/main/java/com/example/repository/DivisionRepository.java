package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Division;

@RepositoryRestResource(collectionResourceRel = "division", path = "division")
public interface DivisionRepository extends CrudRepository<Division, Long> {

	List<Division> findByName(@Param("name") String name);

}
