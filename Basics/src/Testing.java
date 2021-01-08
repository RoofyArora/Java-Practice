class Parent extends Object
{
	int a;
	
	Parent()
	{
		super(); //Object
	}
	
	Parent(int a)
	{
		this(34,67);
		System.out.println("Constructor with one parameter");
		this.a=a;
	}
	Parent(int a, int b)
	{
		System.out.println("Constructor with two parameters");
	}
}
class Child extends Parent
{
	Child()
	{
		super(90); //super class constructor(Parent)
		System.out.println("Child Class Constructor");
	}
}

public class Testing {
	public static void main(String[] args) {
		Child c=new Child();
		
		
	}

}
