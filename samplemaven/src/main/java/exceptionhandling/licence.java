package exceptionhandling;

public class licence {

	public static void main(String[] args) throws LicenceException {
		// TODO Auto-generated method stub
int age = 15;
if (age >=18)
{
	System.out.println("eligible for licence");
}
else 
{
	throw new LicenceException("age under 18!!");
}

	}	
}	
