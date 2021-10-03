package com.maurysette.api;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

// déclare a psring que c'est des tests
@SpringBootTest
// charge le contexte
@AutoConfigureMockMvc
public class EmployeeControllerTestSpringBootTest {

	// injection du bean
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGetEmployees() throws Exception {
		// vérifier si le statut vaut 200
		mockMvc.perform(get("/employees")).andExpect(status().isOk())
				// vérifie le contenu retourné
				.andExpect(jsonPath("$[0].firstName", is("Laurent")));
	}

}