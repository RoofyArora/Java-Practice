class Parent1 {
	
	public void fun1() {
		System.out.println("This is parent class fun1");
	}
}

class Child1 extends Parent1{
	
	@Override
	public void fun1() {
		System.out.println("This is child class fun1");
	}
	public void fun2() {
		System.out.println("This is child class fun1");
	}
	
	
}
public class Demo2 {
	public static void main(String[] args) {
		
		//Child class obj
		Child1 c1=new Child1();
		c1.fun1();
		//Parent class obj
		Parent1 p1=new Parent1();
		p1.fun1();
		//cast up
		Parent1 p2;
		Child1 c2=new Child1();
		p2=(Parent1)c2;
		p2.fun1();
		//cast down
		Child1 c3;
		//Parent1 p3=new Parent1();
		c3=(Child1)p2;
		c3.fun2();
		
	}

}
