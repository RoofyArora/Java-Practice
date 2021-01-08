package com.example;

class Parent
{
	protected Parent career()
	{
		System.out.println("Please go for traditional business");
		return null;
	}
}
class Child extends Parent
{
	@Override
	public Child career()
	{   
		System.out.println("IT career");
		return null;
	}
}

public class OverridingExample {
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.career();
		
	}

}
