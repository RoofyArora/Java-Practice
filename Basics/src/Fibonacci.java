import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,a=0,b=1,c;
		System.out.println("Enter range:");
		num=sc.nextInt();
		
		System.out.println(a+" "+b);
		
		for(int i=3;i<=num;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}

}
