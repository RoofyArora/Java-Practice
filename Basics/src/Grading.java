import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks;
		
		System.out.println("Enter marks: ");
		marks=sc.nextInt();
		
		if(marks>=75)
		{
			System.out.println("Distinction");
		}
		else if(marks>=60)
		{
			System.out.println("First Class");
		}
		else if(marks>=50)
		{
			System.out.println("Pass");
		}
		else if(marks<50)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Enter valid number");
		}
		
	}

}
