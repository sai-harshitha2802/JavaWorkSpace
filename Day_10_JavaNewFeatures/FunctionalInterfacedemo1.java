@FunctionalInterface
interface calculation{
	void add();
}
public class FunctionalInterfacedemo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation cal=()->System.out.println("iam doing addition");
		cal.add();
	}


}

