import java.util.Scanner;

public class VotingCandidate {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter your age: ");
			int Age=sc.nextInt();
			CastVote cv=new CastVote(Age);	
			cv.validateAge(Age);
			
		}catch(MinorAgeException e)
		{
			System.out.println("Not eligible to vote");
		}
	}

}
