
public class NestedTry {
	
	public static void main(String[] args) {
		
		int ary[]= {1,2,3};
		
		try
		{
			System.out.println("outer try 1");
			System.out.println(ary[7]);
			System.out.println("before nested try");
			
			try {
				System.out.println("Inner try 1");
				int total=ary[2]/0;
				System.out.println(total);
			}
			catch(ArithmeticException e)
			{
				System.out.println("error message");
				System.out.println(e.getMessage());
			}
		}catch(Exception ae)
		{
			System.out.println("error message 2");
			System.out.println(ae.getMessage());
		}
	}

}
