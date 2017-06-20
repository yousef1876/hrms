package com.application.hrms.employee.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.EmployeeEducation;

@RepositoryRestResource(collectionResourceRel = "people_education", path = "people_education")
public interface EmployeeEducationRepo extends PagingAndSortingRepository<EmployeeEducation, Long> {

	List<EmployeeEducation> findByMajor(@Param("name") String name);
	
}