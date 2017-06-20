package com.application.hrms.management.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.management.model.DepartmentTeamPlanManagment;
import com.application.hrms.organization.model.Department;

@RepositoryRestResource(collectionResourceRel = "dept_plan_management", path = "dept_plan_management")
public interface DepartmentTeamPlanManagementRepo extends PagingAndSortingRepository<DepartmentTeamPlanManagment, Long> {

	List<DepartmentTeamPlanManagment> findByDepartment(@Param("dept") Department dept);

}