package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Page;


@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PageRepository extends CrudRepository<Page, Long> {

	List<Page> findByName(@Param("name") String name);

}
