package com.application.hrms.guest.security.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.guest.security.model.GuestRole;

@RepositoryRestResource(collectionResourceRel = "guest_sec_users", path = "guest_sec_users")
public interface GuestRoleRepo extends PagingAndSortingRepository<GuestRole, Long> {

	List<GuestRole> findByRoleName(@Param("name") String name);

}