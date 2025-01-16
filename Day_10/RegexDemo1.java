import java.util.regex.Pattern;
public class RegexDemo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("a", "a"));
		System.out.println(Pattern.matches("[a-zA-z]", "A"));
		System.out.println(Pattern.matches("[a-zA-z]+", "aBc"));
		System.out.println(Pattern.matches("[a-zA-z]*", ""));
		System.out.println(Pattern.matches("[A-z]{4}[0-9]{4}[A-Z]", "ABCD1234D"));
		System.out.println(Pattern.matches("[a-zA-z]?", ""));//"","a",but but group"abc"
		System.out.println(Pattern.matches("[a-z]{3,6}", "harshu"));
		System.out.println(Pattern.matches("[a-z]{3,}", "harshith"));
	}


}
