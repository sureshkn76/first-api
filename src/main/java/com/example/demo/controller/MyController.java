package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.GroceryItem;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.GroceryService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired 
	GroceryService groceryService;
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/showAllItems")
	public List<GroceryItem> getItemList()  {
		return groceryService.getItems();
	}
	
	@PostMapping("/addItems")
	public void addItem(@RequestBody GroceryItem item)  {
		 groceryService.addItem(item);
	}

	@PostMapping("/addEmployee") 
	public void addEmployeeDetails(@RequestBody EmployeeEntity employee)  {
		employeeService.addItem(employee);
	}
	
	@PutMapping("/updateEmployee") 
	public void updateEmployeeDetails(@RequestBody EmployeeEntity employee)  {
		employeeService.addItem(employee);
	}
	
	@DeleteMapping("/deleteEmployee") 
	public void deleteEmployeeDetails(@RequestParam String id)  {
		employeeService.deleteEmployeeDetails(id);
	}	
	
	@GetMapping("/displayEmployees")
	public List<EmployeeEntity> getEmployeeList()  {
		return employeeService.getEmployeeDetails();
	}	
	
	@GetMapping("/displayEmployeesByName")
	public List<EmployeeEntity> getEmployeeByName(@RequestParam String name)  {
		return employeeService.getEmployeeByName(name);
	}	
	
	@GetMapping("/displayEmployeesByNameAndSalary")
	public List<EmployeeEntity> getEmployeeByNameAndSalary(@RequestParam String name,@RequestParam BigDecimal salary)  {
		return employeeService.getEmployeeByNameAndSalary(name,salary);
	}		
	
	@GetMapping("/displayFirstNameAndDepartmentBySalary")
	public List<EmployeeEntity> getFirstNameAndDepartmentBySalary(@RequestParam BigDecimal salary)  {
		return employeeService.getFirstNameAndDepartmentBySalary(salary);
	}		
}
