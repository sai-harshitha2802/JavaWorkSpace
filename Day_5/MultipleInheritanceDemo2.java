interface A{
	void greet();
}
interface B extends A{
	void display();
}
class Test2 implements B 
{


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("its b-display");
		
	}


	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("its a-greet");
		
	}
	
}


public class MultipleInheritanceDemo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B b =new Test2();
		 b.display();
		 b.greet();
	}


}
