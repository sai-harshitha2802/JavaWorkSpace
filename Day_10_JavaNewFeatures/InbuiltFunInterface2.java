import java.util.function.Function;


public class InbuiltFunInterface2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> nameLength =(name)->name.length();
		System.out.println(nameLength.apply("harshu"));
		
		Function<String,String>concat=(name)->name.concat(" hie ");
		System.out.println(concat.apply(" harshu"));


	}


}
