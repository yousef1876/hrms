package com.application.hrms.organization.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.organization.model.Organization;

@RepositoryRestResource(collectionResourceRel = "organization", path = "organization")
public interface OrganizationRepo extends PagingAndSortingRepository<Organization, Long> {

	List<Organization> findByOrganizationName(@Param("name") String name);

}