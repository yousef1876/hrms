package com.application.hrms.employee.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.EmployeeLeave;

@RepositoryRestResource(collectionResourceRel = "people_leave", path = "people_leave")
public interface EmployeeLeaveRepo extends PagingAndSortingRepository<EmployeeLeave, Long> {

	List<EmployeeLeave> findByFromDate(@Param("name") Date name);
	
	List<EmployeeLeave> findByToDate(@Param("name") Date name);
	
}
