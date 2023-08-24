package com.lawencon.assetsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lawencon.assetsystem.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
