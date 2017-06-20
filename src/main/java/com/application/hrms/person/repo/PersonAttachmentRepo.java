package com.application.hrms.person.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.person.model.Person;
import com.application.hrms.person.model.PersonAttachment;

@RepositoryRestResource(collectionResourceRel = "person_attachment", path = "person_attachment")
public interface PersonAttachmentRepo extends PagingAndSortingRepository<PersonAttachment, Long> {

	List<PersonAttachment> findByPersons(@Param("person") Person person);

}