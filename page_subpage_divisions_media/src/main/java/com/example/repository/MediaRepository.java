package com.example.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Media;

@RepositoryRestResource(collectionResourceRel = "media", path = "media")
public interface MediaRepository extends CrudRepository<Media, Long> {
}
