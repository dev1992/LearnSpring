package com.dev2014;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		SuperHelloWorld shw = (SuperHelloWorld)context.getBean("superHelloWorld");
		HelloWorld hw1 = (HelloWorld)context.getBean("helloWorld");
		HelloWorld hw2 = (HelloWorld)context.getBean("helloWorld");
		System.out.println(hw1.getMessage()+" -- "+hw2.getMessage());
		System.out.println(hw1.toString().equals(hw2.toString()));
	}

}