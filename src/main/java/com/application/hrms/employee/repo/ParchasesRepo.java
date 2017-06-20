package com.application.hrms.employee.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.Parchases;

@RepositoryRestResource(collectionResourceRel = "people_parchases", path = "people_parchases")
public interface ParchasesRepo extends PagingAndSortingRepository<Parchases, Long> {

	List<Parchases> findBySerialNo(@Param("name") String name);

}