package me.christyjohn.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.christyjohn.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
