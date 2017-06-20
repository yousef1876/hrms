package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.ProjectForumSubjects;

@RepositoryRestResource(collectionResourceRel = "project_forum_subjects", path = "project_forum_subjects")
public interface ProjectForumSubjectsRepo extends PagingAndSortingRepository<ProjectForumSubjects, Long> {

	List<ProjectForumSubjects> findByTitle(@Param("title") String title);

}