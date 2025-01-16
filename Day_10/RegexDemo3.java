import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p =Pattern.compile("ab");
		Matcher m=p.matcher("abjavabpythonabhtmlab");
//		System.out.println(m.matches());
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
			//m.start()-->starting index
			//m.end()-->ending index
			//m.group-->which is the matching group
		}
		System.out.println(m.matches());


	}


}
