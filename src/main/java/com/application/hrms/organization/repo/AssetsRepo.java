package com.application.hrms.organization.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.organization.model.Assets;
import com.application.hrms.organization.model.Department;

@RepositoryRestResource(collectionResourceRel = "assets", path = "assets")
public interface AssetsRepo extends PagingAndSortingRepository<Assets, Long> {

	List<Assets> findByDepartments(@Param("dept") Department dept);

}