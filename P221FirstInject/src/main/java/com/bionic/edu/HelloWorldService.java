package com.bionic.edu;

import javax.inject.*;

@Named
public class HelloWorldService implements GreetingService {

	private String message;
	private int repeat = 1;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRepeat() {
		return repeat;
	}
	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}

    public HelloWorldService(){ message = ""; }
    public HelloWorldService(String message){
	this.message = message;
    }

	@Override
	public void sendGreeting(){
        for (int i = 0; i < repeat; i++){
	     System.out.println("Hello, world! " + message);
        }

		}
}