
public class ICICIBank {
	
	public int withdrawAmount(int accountNumber, int amount) throws InvalidAccountNumberException
	{
		if(accountNumber<100 || accountNumber>500)
		{
			throw new InvalidAccountNumberException();
		}
		else
		{
			System.out.println("successful operation");
			return 2000;
		}
	}

}
