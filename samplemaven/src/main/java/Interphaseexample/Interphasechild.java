package Interphaseexample;

public class Interphasechild implements Interphase1 {
 
	
	public static void main(String[] args) {
		Interphasechild obj = new Interphasechild();
		obj.display();
		obj.print();	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	System.out.println("display" );
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("print");	
	}
}
