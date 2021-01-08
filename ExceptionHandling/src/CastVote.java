
public class CastVote {
	
	int Age;
	
	CastVote(int Age) 
	{
		this.Age=Age;
	}
	public void validateAge(int a) throws MinorAgeException
	{
		if(Age<18)
		{
			throw new MinorAgeException();
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}

}
