package inhertance;

public class Multiplechild  implements Multipleparent1,multipleparent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Multiplechild obj=  new Multiplechild ();
  obj.display();
  obj.print();
  
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print"); 
	}

}
