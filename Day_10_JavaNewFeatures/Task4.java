interface test9{
	int largestNumber(int a, int b, int c);
}
public class Task4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test9 t9=(a,b,c)->{
			if(a>b && a>c)
				return a;
			else if(b>a && b>c)
				return b;
			return c;
						
		};
		System.out.println(t9.largestNumber(1,2,9));


	}


}
