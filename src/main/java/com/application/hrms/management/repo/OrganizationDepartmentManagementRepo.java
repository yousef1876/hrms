package com.application.hrms.management.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.management.model.OrganizationDepartmentManagment;
import com.application.hrms.organization.model.Department;


@RepositoryRestResource(collectionResourceRel = "organization_dept_management", path = "organization_dept_management")
public interface OrganizationDepartmentManagementRepo extends PagingAndSortingRepository<OrganizationDepartmentManagment, Long> {

	List<OrganizationDepartmentManagment> findByDepartment(@Param("dept") Department dept);

}
