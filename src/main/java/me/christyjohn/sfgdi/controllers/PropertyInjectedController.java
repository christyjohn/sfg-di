package me.christyjohn.sfgdi.controllers;

import me.christyjohn.sfgdi.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
