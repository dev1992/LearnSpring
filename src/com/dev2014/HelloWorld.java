package com.dev2014;

public class HelloWorld {
	String message1,message2;
	HelloWorld(){
		System.out.println("Inside HelloWorld Contructor!");
	}
	
	
	public HelloWorld(String message1,String message2) {
		super();
		this.message1 = message1;
		this.message2 = message2;
	}


	public String getMessage() {
		return message1+ " <--> "+message2;
	}
	public void setMessage(String message1,String message2) {
		this.message1 = message1;
		this.message2 = message2;
		System.out.println("Message has been set!");
	}
	
}
