package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.BugAnswers;

@RepositoryRestResource(collectionResourceRel = "bug_answers", path = "bug_answers")
public interface BugAnswersRepo extends PagingAndSortingRepository<BugAnswers, Long> {

	List<BugAnswers> findByAnswer(@Param("name") String name);

}
