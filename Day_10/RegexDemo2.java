import java.util.regex.Pattern;


public class RegexDemo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("\\w", "1"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "a"));
		System.out.println(Pattern.matches("[abc]+", "abbb"));
		System.out.println(Pattern.matches("[^abc]+", "deff"));
	}


}
