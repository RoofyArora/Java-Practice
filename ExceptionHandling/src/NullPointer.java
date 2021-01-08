
public class NullPointer {
	
	public static void main(String[] args) {
		String s;
		
		try
		{
			System.out.println("First line in try");
			s=null;
			System.out.println("check");
			s.length();
			System.out.println(s);
			
		}catch(NullPointerException e)
		{
			System.out.println("Error message");
			System.out.println(e.getMessage());
		}
		System.out.println("Last line in main");
	}

}
