package inhertance;

public class multilevelchild extends multilevelparent  {

public void print()	
{
	System.out.println( "from the child class ");
}
	
public static void main(String[] args) 
{
		// TODO Auto-generated method stub
 multilevelchild obj= new multilevelchild ();
    obj. display();	 
    obj.show ();
    obj.print();
}
}