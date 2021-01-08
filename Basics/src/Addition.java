import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		addition(num1,num2);
	}
	static void addition(int x,int y)
	{
		int result=x+y;
		System.out.println("Sum= "+result);	
	}

}
