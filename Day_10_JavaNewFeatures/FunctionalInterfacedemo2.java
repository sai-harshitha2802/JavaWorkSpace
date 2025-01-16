interface Test1{
	void diaplay();
}


public class FunctionalInterfacedemo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 =()->System.out.println("hello hi");
		Test1 t2 =()->{
			System.out.println("one");
			System.out.println("two");
		};
		t1.diaplay();
		System.out.println("--------------------");
		t2.diaplay();
	}


}
