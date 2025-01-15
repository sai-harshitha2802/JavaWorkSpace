
public class ExceptionDemo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("wake up");
        System.out.println("get ready");
        System.out.println("eat and pack the lunch");
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("do not divide by 0");
        }
        System.out.println("walk for 10-15 mts");
        System.out.println("sign attendance");
        System.out.println("start ur day");

    }

}
