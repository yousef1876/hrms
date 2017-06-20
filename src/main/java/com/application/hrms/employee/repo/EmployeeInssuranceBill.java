package com.application.hrms.employee.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.application.hrms.employee.model.EmployeeInsuranceBills;

@RepositoryRestResource(collectionResourceRel = "people_inssurance_bill", path = "people_inssurance_bill")
public interface EmployeeInssuranceBill extends PagingAndSortingRepository<EmployeeInsuranceBills, Long> {

	List<EmployeeInsuranceBills> findByBillNo(@Param("name") String name);

}
