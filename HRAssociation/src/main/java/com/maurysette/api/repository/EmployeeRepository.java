package com.maurysette.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maurysette.api.model.Employee;

// spécialisation de component
// déclare a spring que c'est un bean 
// et aux développeurs que son rôle est de communiquer avec une base de données
@Repository
// CrudRepository est fourni par spring, fourni les methodes crud pour manipuler l'entité
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}