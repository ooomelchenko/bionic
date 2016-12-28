package com.bionic.edu;

import javax.inject.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Named
public class Application {
	@Inject // @Autowired
	@Named("helloKittyService")
	GreetingService greeting ;
    public Application(){}
    public Application(GreetingService greeting){ this.greeting = greeting; }

    public GreetingService getGreeting() {
		return greeting;
	}
	public void setGreeting(GreetingService greeting) {
		this.greeting = greeting;
	}
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new 	AnnotationConfigApplicationContext();
	      ctx.register(RootContextConfiguration.class);
	      ctx.refresh();
	      Application applic = (Application)ctx.getBean("application");
	      applic.start();

     }
     public void start(){
	if (greeting != null) greeting.sendGreeting();
    } 
}
