import java.util.regex.Pattern;


public class ValidationDemo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex ="[7-9]{2}[0-9]{8}";
		String str ="8734567890";
		System.out.println(Pattern.matches(regex, str));
		


	}


}
