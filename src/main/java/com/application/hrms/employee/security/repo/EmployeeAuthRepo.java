package com.application.hrms.employee.security.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.security.model.EmployeeAuth;
import com.application.hrms.employee.security.model.EmployeeUser;

@RepositoryRestResource(collectionResourceRel = "people_sec_users_roles", path = "people_sec_users_roles")
public interface EmployeeAuthRepo extends PagingAndSortingRepository<EmployeeAuth, Long> {

	List<EmployeeAuth> findByEmployees(@Param("name") EmployeeUser name);

}