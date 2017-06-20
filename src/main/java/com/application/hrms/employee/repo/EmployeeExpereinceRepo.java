
package com.application.hrms.employee.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.EmployeeExpereince;

@RepositoryRestResource(collectionResourceRel = "people_expereince", path = "people_expereince")
public interface EmployeeExpereinceRepo extends PagingAndSortingRepository<EmployeeExpereince, Long> {

	List<EmployeeExpereince> findByTitle(@Param("name") String name);

}