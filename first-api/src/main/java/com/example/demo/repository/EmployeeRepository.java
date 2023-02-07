package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.entity.EmployeeEntity;


public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {
	
    @Query("{firstName:?0}")
    List<EmployeeEntity> getEmployeeByName(String name);	
    
    @Query("{firstName:?0,salary:{$gte:?1}}")
    List<EmployeeEntity> getEmployeesByNameAndSalary(String name, BigDecimal salary);
    
    //------------------- @Query with Projection ---------------------------------------
    @Query(value= "{salary:{$gt:?0}}", fields="{firstName:1, department:1}") 
    List<EmployeeEntity> getFirstNameAndDepartmentBySalary(BigDecimal salary);	    
}
