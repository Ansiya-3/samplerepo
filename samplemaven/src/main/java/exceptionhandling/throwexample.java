package exceptionhandling;

public class throwexample {

public static void main (String args[]) throws VotingException
{
	int age=15;
	if(age>=18)
	{
		System.out.println("eligible to vote");
	}
	else
	{
		throw new VotingException("age under 18!!");
		}
	
}
}