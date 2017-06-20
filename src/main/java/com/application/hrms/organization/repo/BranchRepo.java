package com.application.hrms.organization.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.organization.model.Branch;

@RepositoryRestResource(collectionResourceRel = "branch", path = "branch")
public interface BranchRepo extends PagingAndSortingRepository<Branch, Long> {

	List<Branch> findByBrancheName(@Param("branch") String branch);

}