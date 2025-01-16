import java.util.function.Predicate;


public class InbuiltFunInterface {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=(age)->age>18;
		System.out.println(p.test(15));
		System.out.println(p.test(22));
		
		Predicate<String> p1 =(name)->name.startsWith("s");
		System.out.println(p1.test("sai harshitha"));


	}


}
