package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.Issues;

@RepositoryRestResource(collectionResourceRel = "issues", path = "issues")
public interface IssuesRepo extends PagingAndSortingRepository<Issues, Long> {

	List<Issues> findByIssueName(@Param("name") String name);

}