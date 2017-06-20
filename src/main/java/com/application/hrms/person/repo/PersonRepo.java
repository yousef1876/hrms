package com.application.hrms.person.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.person.model.Person;

@RepositoryRestResource(collectionResourceRel = "assets", path = "assets")
public interface PersonRepo extends PagingAndSortingRepository<Person, Long> {

	List<Person> findByIdNo(@Param("id") String id);

}