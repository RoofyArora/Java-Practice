
public class WithExceptionHandling {
	
	public static void main(String[] args) {
		int a=100;
		int b=0;
		int div;
		
		try
		{
			div=a/b;
			System.out.println("div ="+div);
			System.out.println("Last line in try block");
			
		}catch(ArithmeticException ae)
		{
			
			System.out.println("error message");
			System.out.println(ae.getMessage());
		}
		System.out.println("Last line in main");
	}

}
