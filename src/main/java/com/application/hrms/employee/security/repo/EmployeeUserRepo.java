package com.application.hrms.employee.security.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.security.model.EmployeeUser;

@RepositoryRestResource(collectionResourceRel = "people_sec_users", path = "people_sec_users")
public interface EmployeeUserRepo extends PagingAndSortingRepository<EmployeeUser, Long> {

	List<EmployeeUser> findByUsername(@Param("name") String name);

}