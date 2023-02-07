package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepo;

	public List<EmployeeEntity> getEmployeeDetails() {
		return employeeRepo.findAll();
	}
	
	public void updateEmployeeDetails(EmployeeEntity employee) {
		employeeRepo.save(employee);
	}
	
	public void deleteEmployeeDetails(String id) {
		employeeRepo.deleteById(id);
	}	

	public void addItem(EmployeeEntity employee) {
		employeeRepo.save(employee);
	}

	public List<EmployeeEntity> getEmployeeByName(String name) {
		return employeeRepo.getEmployeeByName(name);
	}

	public List<EmployeeEntity> getEmployeeByNameAndSalary(String name, BigDecimal salary) {
		return employeeRepo.getEmployeesByNameAndSalary(name,salary);
	}

	public List<EmployeeEntity> getFirstNameAndDepartmentBySalary(BigDecimal salary) {
		return employeeRepo.getFirstNameAndDepartmentBySalary(salary);
	}
}
