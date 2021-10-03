package com.maurysette.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurysette.api.model.Employee;
import com.maurysette.api.repository.EmployeeRepository;

import lombok.Data;

//annotation Lombok gère les getters et setters
@Data
// @Service spécialisation de component
// déclare a spring que c'est un bean 
//et aux développeurs que son rôle est service
@Service
public class EmployeeService {

	// injecte le bean employeeRepository
	@Autowired
	private EmployeeRepository employeeRepository;

	public Optional<Employee> getEmployee(final Long id) {
		return employeeRepository.findById(id);
	}

	public Iterable<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(final Long id) {
		employeeRepository.deleteById(id);
	}

	public Employee saveEmployee(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}

}