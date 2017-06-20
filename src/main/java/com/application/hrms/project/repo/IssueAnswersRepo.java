package com.application.hrms.project.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.project.model.IssueAnswers;

@RepositoryRestResource(collectionResourceRel = "issue_answers", path = "issue_answers")
public interface IssueAnswersRepo extends PagingAndSortingRepository<IssueAnswers, Long> {

	List<IssueAnswers> findByAnswer(@Param("name") String name);

}