package com.application.hrms.employee.repo;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.Employee;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findByLastName(@Param("name") String name);

	List<Employee> findByFirstName(@Param("name") String name);
	
	List<Employee> findByIdNo(@Param("idNo") String name);
	
}
