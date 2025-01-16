interface Calculation2{
	int operation(int a, int b);
}


public class LamdaExpDemo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation2 add =(a,b)->{
			return a+b;
		};
		Calculation2 add2 =(a,b)->a+b;
		
		Calculation2 findLarge =(a,b)->{
			if(a>b)
				return a;
			return b;
		};
		System.out.println(add.operation(2,3));
		System.out.println(add2.operation(2,6));
		System.out.println(findLarge.operation(2,3));
	}


}
