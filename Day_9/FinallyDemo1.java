
public class FinallyDemo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            System.out.println(2 / 2);
        } catch (Exception e) {
            System.out.println("catch called");
            System.out.println("exception occured");
        } finally {
            System.out.println("finally calleds");
        }

    }

}
