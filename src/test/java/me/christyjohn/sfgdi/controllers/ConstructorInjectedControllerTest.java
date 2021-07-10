package me.christyjohn.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.christyjohn.sfgdi.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}
