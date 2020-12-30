package com.b1a9idps.emptyspringbootpj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import com.b1a9idps.emptyspringbootpj.controller.UserController;

@SpringBootTest
class ApplicationTests {

	@Autowired
	WebApplicationContext context;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(context.getBean(UserController.class));
	}

}
