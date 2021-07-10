package me.christyjohn.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.christyjohn.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
    SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
        System.out.println(controller.getGreeting());
	}

}
