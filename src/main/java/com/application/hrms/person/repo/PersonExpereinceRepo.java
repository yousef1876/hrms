package com.application.hrms.person.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.person.model.Person;
import com.application.hrms.person.model.PersonExpereince;

@RepositoryRestResource(collectionResourceRel = "person_expereince", path = "person_expereince")
public interface PersonExpereinceRepo extends PagingAndSortingRepository<PersonExpereince, Long> {

	List<PersonExpereince> findByPersons(@Param("person") Person person);

}
