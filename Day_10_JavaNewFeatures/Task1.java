interface TestFile {
	int FindCube(int a);
}




public class Task1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFile test1 =(a)->{
			return a*a*a;
		};
		System.out.println(test1.FindCube(3));
	}


}
