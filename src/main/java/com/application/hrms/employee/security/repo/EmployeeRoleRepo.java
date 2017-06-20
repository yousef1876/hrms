package com.application.hrms.employee.security.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.security.model.EmployeeRole;

@RepositoryRestResource(collectionResourceRel = "people_sec_roles", path = "people_sec_roles")
public interface EmployeeRoleRepo extends PagingAndSortingRepository<EmployeeRole, Long> {

	List<EmployeeRole> findByRoleName(@Param("name") String name);

}