package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.Bugs;

@RepositoryRestResource(collectionResourceRel = "bugs", path = "bugs")
public interface BugsRepo extends PagingAndSortingRepository<Bugs, Long> {

	List<Bugs> findByBugTitle(@Param("name") String name);

}