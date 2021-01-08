package classes_objects;

public class Classes {
	
	int a;
	
	public static void main(String[] args) {
		
		Classes d=new Classes();
		
		System.out.println(d.a);
		
		Classes e=d;
		
		System.out.println(e.a);
		
		e.a=100;
		
		System.out.println(d.a);
		
		e=null;
		System.out.println(d.a);
	}

}
