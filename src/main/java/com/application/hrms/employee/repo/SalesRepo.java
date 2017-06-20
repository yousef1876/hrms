package com.application.hrms.employee.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.Sales;

@RepositoryRestResource(collectionResourceRel = "people_sales", path = "people_sales")
public interface SalesRepo extends PagingAndSortingRepository<Sales, Long> {

	List<Sales> findBySerialNo(@Param("name") String name);

}
