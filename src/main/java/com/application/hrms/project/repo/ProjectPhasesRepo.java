package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.ProjectPhases;

@RepositoryRestResource(collectionResourceRel = "project_phases", path = "project_phases")
public interface ProjectPhasesRepo extends PagingAndSortingRepository<ProjectPhases, Long> {

	List<ProjectPhases> findByTitle(@Param("title") String title);

}