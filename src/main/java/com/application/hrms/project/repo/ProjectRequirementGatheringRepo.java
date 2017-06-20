package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.ProjectRequirmentGathering;

@RepositoryRestResource(collectionResourceRel = "project_requirements", path = "project_requirements")
public interface ProjectRequirementGatheringRepo extends PagingAndSortingRepository<ProjectRequirmentGathering, Long> {

	List<ProjectRequirmentGathering> findByTitle(@Param("title") String title);

}