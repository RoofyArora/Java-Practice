package classes_objects;

public class MyClass {
	
	int a;
	
	MyClass(int a)
	{
		System.out.println("Constructor");
		this.a=a;
	}
	
	public static void main(String[] args) {
		MyClass m=new MyClass(200);
		System.out.println(m.a);
		
	}

}
