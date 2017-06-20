package com.application.hrms.employee.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.EmployeeAttendance;

@RepositoryRestResource(collectionResourceRel = "people_attendance", path = "people_attendance")
public interface EmployeeAttendanceRepo extends PagingAndSortingRepository<EmployeeAttendance, Long> {

	List<EmployeeAttendance> findByFromDate(@Param("date") Date date);

	List<EmployeeAttendance> findByToDate(@Param("date") Date date);
	
}