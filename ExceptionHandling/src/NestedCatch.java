
public class NestedCatch {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		try {
			System.out.println(arr[7]);
		}catch(Exception ae)
		{
			System.out.println("error message 1");
			System.out.println(ae.getMessage());
			try {
				int total=arr[2]/0;
				System.out.println("inner try catch 1");
				System.out.println(total);
				
			}catch(ArithmeticException e)
			{
				System.out.println("inner catch message 1");
				System.out.println(e.getMessage());
			}
	     	}
	}

}
