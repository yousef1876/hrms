package com.application.hrms.management.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.management.model.OrganizationManagment;
import com.application.hrms.organization.model.Organization;

@RepositoryRestResource(collectionResourceRel = "organization_management", path = "organization_management")
public interface OrganizationManagementRepo extends PagingAndSortingRepository<OrganizationManagment, Long> {

	List<OrganizationManagment> findByOrganization(@Param("name") Organization name);

}