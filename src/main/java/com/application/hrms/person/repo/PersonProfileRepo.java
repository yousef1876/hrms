package com.application.hrms.person.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.person.model.Person;
import com.application.hrms.person.model.PersonProfile;

@RepositoryRestResource(collectionResourceRel = "person_profile", path = "person_profile")
public interface PersonProfileRepo extends PagingAndSortingRepository<PersonProfile, Long> {

	List<PersonProfile> findByPersons(@Param("person") Person person);

}