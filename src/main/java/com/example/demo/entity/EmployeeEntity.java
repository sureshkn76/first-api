package com.example.demo.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee_details")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
	@Id
	String id;
	String firstName;
	String lastName;
	String department;
	BigDecimal salary;
}
