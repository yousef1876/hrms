package com.application.hrms.person.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.person.model.Person;
import com.application.hrms.person.model.PersonEducation;

@RepositoryRestResource(collectionResourceRel = "person_education", path = "person_education")
public interface PersonEducationRepo extends PagingAndSortingRepository<PersonEducation, Long> {

	List<PersonEducation> findByPersons(@Param("person") Person person);

}
