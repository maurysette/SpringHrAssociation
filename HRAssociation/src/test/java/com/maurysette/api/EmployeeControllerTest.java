package com.maurysette.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.maurysette.api.controller.EmployeeController;
import com.maurysette.api.service.EmployeeService;

// déclenche le mécanisme permettant de tester les controllers
// on déclare le controllerque l'on test
@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {

	@Autowired
	// permet d'appeler la méthode perform
	private MockMvc mockMvc;

	@MockBean
	// déclare que le bean est EmloyeeService car la classe EmployeeController
	// l'utilise
	private EmployeeService employeeService;

	@Test
	public void testGetEmployees() throws Exception {
		// on execute un get url et on indique que l'on attend une réponse 200

		mockMvc.perform(get("/employees")).andExpect(status().isOk());
	}

}