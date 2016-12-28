package com.bionic.edu;

import javax.inject.*;

@Named
public class HelloKittyService implements GreetingService {
	@Override
	public void sendGreeting(){
		System.out.println("Hello, Kitty!");
		}
}
