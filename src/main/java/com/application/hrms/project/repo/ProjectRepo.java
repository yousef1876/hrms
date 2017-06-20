package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.organization.model.Department;
import com.application.hrms.project.model.Project;

@RepositoryRestResource(collectionResourceRel = "project", path = "project")
public interface ProjectRepo extends PagingAndSortingRepository<Project, Long> {

	List<Project> findByDepartments(@Param("dept") Department dept);

}
