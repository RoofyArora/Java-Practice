import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter number of employees: ");
		n=sc.nextInt();
		Employee[] e1=new Employee[n];
		for(int i=0;i<n;i++)
		{
			e1[i]=new Employee();
			System.out.println("Enter employee number:");
			e1[i].setEmpID(sc.nextInt());
			System.out.println("Enter employee name:");
			e1[i].seteName(sc.next());
			
			System.out.println("How many technologies do employee work on:");
			int num=sc.nextInt();
			String[] technology=new String[num];
			System.out.println("Enter names of technology(s) known:");
			for(int j=0;j<num;j++)
			{
				technology[j]=sc.next();
			}
			e1[i].setTechnologies(technology);
				
		}
		System.out.println("Entered details of employees are:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Employee Number: "+e1[i].getEmpID());
			System.out.println("Employee Name: "+e1[i].geteName());
			System.out.print("Employee Technologies:");
			for(String tech:e1[i].getTechnologies())
			{
				System.out.print(tech+" ");
			}
		}
		
		}

}
