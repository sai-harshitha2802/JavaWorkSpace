import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "[abc]{2}[0-9]";
		String str ="ab1";
		System.out.println(Pattern.matches(regex, str));
		System.out.println("======================format 2");
		Pattern p =Pattern.compile(regex);
		Matcher m= p.matcher(str);
		System.out.println(m.matches());


	}


}
