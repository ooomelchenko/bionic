package com.bionic.edu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	GreetingService greeting = null;
    public Application(){}
    public Application(GreetingService greeting){ this.greeting = greeting; }

    public GreetingService getGreeting() {
		return greeting;
	}
	public void setGreeting(GreetingService greeting) {
		this.greeting = greeting;
	}
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	Application application = (Application)ctx.getBean("application");
	application.start();
     }
     public void start(){
	if (greeting != null) greeting.sendGreeting();
    } 
}
