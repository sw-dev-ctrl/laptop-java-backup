package com.example.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Division;

@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface DivisionRepository extends PagingAndSortingRepository<Division, Long> {

	List<Division> findByName(@Param("name") String name);

}
