package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.ProjectTasks;

@RepositoryRestResource(collectionResourceRel = "project_forum", path = "project_forum")
public interface ProjectTasksRepo extends PagingAndSortingRepository<ProjectTasks, Long> {

	List<ProjectTasks> findBySubject(@Param("subject") String subject);

}
