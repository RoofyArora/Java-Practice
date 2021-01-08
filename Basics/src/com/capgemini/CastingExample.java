package com.capgemini;

class Employee
{}

class Developer extends Employee
{}

class Tester extends Employee
{}

public class CastingExample {
	
	public static void main(String[] args) {
		
		Developer d=new Developer();
		
		Employee e=d;       // upcasting
		
		Developer d2=(Developer)e; // downcasting
		
		Tester t=(Tester)e;
	}

}
