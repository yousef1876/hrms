package com.application.hrms.organization.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.organization.model.Department;

@RepositoryRestResource(collectionResourceRel = "department", path = "department")
public interface DepartmentRepo extends PagingAndSortingRepository<Department, Long> {

	List<Department> findByDepartmentName(@Param("branch") String branch);

}
