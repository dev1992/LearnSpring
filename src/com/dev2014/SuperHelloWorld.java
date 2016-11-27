package com.dev2014;

public class SuperHelloWorld {
	HelloWorld hello;

	
	
	public SuperHelloWorld() {
		System.out.println("Inside super heloworld!");
	}

	public HelloWorld getHello() {
		return hello;
	}

	public void setHello(HelloWorld hello) {
		this.hello = hello;
		System.out.println("Super setting!");
	}
	
}
