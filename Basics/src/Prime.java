import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int flag=0;
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
		
	}

}
