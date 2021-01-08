
public class MainApp {
	public static void main(String[] args) {
		
		ICICIBank bank=new ICICIBank();
		
		try
		{
			System.out.println("Balance= "+bank.withdrawAmount(150,1500));
			
		}catch(InvalidAccountNumberException e)
		{
			System.out.println("Invalid account number");
		}
	}

}
