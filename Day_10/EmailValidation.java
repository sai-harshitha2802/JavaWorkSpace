
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String regex = "^[a-z0-9]+@[a-zA-Z0-9]+.[a-z]{2,}$";
        String str = "osaiharshitha@gmail.com";
        System.out.println(Pattern.matches(regex, str));

    }

}
