interface Demo1{
	void fatherName();
	void disp();
}
interface Demo2{
	void fatherName();
	void disp2();
}
class Test implements Demo1,Demo2{


	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("display2");
		
	}


	@Override
	public void fatherName() {
		// TODO Auto-generated method stub
		System.out.println("fathername");
	}


	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp");
	}
	
}

public class MultipleInheritanceDemo1 {
 public static void main(String[] args) {
	 Demo1 d1 =new Test();
	 d1.disp();
	 d1.fatherName();
			 
 }
}
