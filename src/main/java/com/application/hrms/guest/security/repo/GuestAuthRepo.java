package com.application.hrms.guest.security.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.guest.security.model.GuestAuth;
import com.application.hrms.guest.security.model.GuestUser;

@RepositoryRestResource(collectionResourceRel = "guest_sec_users", path = "guest_sec_users")
public interface GuestAuthRepo extends PagingAndSortingRepository<GuestAuth, Long> {

	List<GuestAuth> findByEmployees(@Param("name") GuestUser name);

}
