package com.capgemini;

class Parent
{
	int a;
	Parent()
	{
		a=100;
	}
	void m1()
	{
		System.out.println("super class m1");
	}
}

class Child extends Parent
{
	int b;
	Child()
	{
		b=200;
	}
	
	void m1()
	{
		System.out.println("subclass m1");
	}
	public void show()
	{   
		System.out.println(a);
		m1();
		super.m1();
	}
}

public class This_Super_Demo {
	
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}

}
