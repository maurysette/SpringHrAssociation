package com.maurysette.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// annotation Lombok gère les getters et setters
@Data
// déclare que la classe correspond à une table de la base de données
@Entity
// nom de la table, si pas d'annotation nom de la classe par défault
@Table(name = "employees")
public class Employee {

	// déclare que c'est la clé primaire de la table
	@Id
	// permet d'auto incrementer cet id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// associe le champ à la colonne dans la base de données
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String mail;

	private String password;

}