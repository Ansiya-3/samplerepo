package encapsulation;

public class Encap1 {
	private int age ;
	private String name; 
	public void setter( String name ,int age )
	{
		this.name=name;
		this.age=age;
		
	}
	
public void getter()
{
	System.out.println(age);
	System.out.println(name);
}
}
