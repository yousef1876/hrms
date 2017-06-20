package com.application.hrms.management.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.management.model.TeamManagement;
import com.application.hrms.organization.model.Department;

@RepositoryRestResource(collectionResourceRel = "team_management", path = "team_management")
public interface TeamManagementRepo extends PagingAndSortingRepository<TeamManagement, Long> {

	List<TeamManagement> findByDepartment(@Param("name") Department name);

}