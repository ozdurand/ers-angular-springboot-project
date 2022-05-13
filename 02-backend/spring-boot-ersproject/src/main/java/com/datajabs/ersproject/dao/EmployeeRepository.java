package com.datajabs.ersproject.dao;

import com.datajabs.ersproject.entity.Employee;
import com.datajabs.ersproject.entity.Reimbursement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "employee", path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Page<Employee> findById(@RequestParam("id") Long id, Pageable pageable);


    Page<Employee> deleteById(@PathVariable Long id, Pageable pageable);

}
