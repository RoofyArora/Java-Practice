import java.util.Scanner;

public class ElectricityBill {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int unit;
		double bill;
		
		System.out.println("Enter units: ");
		unit=sc.nextInt();
		
		if(unit<=100)
		{
			bill=unit*2;
		}
		else if(unit<=101 && unit>=200)
		{
			bill=100*2+(unit-100)*3;
		}
		else if(unit<=201 && unit>=300)
		{
			bill=100*2+100*3+(unit-200)*4;
		}
		else
		{
			bill=100*2+100*3+100*4+(unit-300)*5;
		}
		System.out.println("Total bill is: "+bill);
	}

}
