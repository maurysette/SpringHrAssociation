package com.maurysette.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurysette.api.model.Employee;
import com.maurysette.api.service.EmployeeService;

// indique que c'est un bean
// indique à spring d'insérer le retour de la méthode au format JSON dans le corps de la réponse HTTP
// les applications communiquant avec l'API accéderont au résultat de leur requête en parsant/analysant la réponse HTTP.
@RestController
public class EmployeeController {

	// on injecte le bean EmployeeService
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Read - Get all employees
	 * 
	 * @return - An Iterable object of Employee full filled
	 */
	// cela permet d'appeler les méthodes du bean injecté via l'url du mapping
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

}
