package com.itau.api.app.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwaggerConfigTest {

	@Test
	void testAPI() {
		
		SwaggerConfig swaggerConfig = new SwaggerConfig();
		assertNotNull(swaggerConfig.api());
	}

}
