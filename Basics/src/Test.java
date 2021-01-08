
public class Test {
	
	void m1()
	{
		System.out.println("From m1");
	}
	
	static void m2()
	{
		System.out.println("From static m2");
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		m2();
	}

}
