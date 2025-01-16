interface Test3{
	int findNameLength(String name);
}


public class Task2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 t3 =(name)->{
			return name.length();
		};
		System.out.println(t3.findNameLength("harshitha"));
		


	}


}
