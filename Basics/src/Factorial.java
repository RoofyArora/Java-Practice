import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long fact=1;
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of number : "+fact);
	}

}
