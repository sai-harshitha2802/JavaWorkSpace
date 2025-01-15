
public class MultipleExceptionDemo1 {

    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            System.out.println(arr[3]);
            System.out.println(2 / 0);
            System.out.println("hi");
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception occured");
        } catch (ArrayIndexOutOfBoundsException be) {
            System.out.println("Array index Exception occured");

        }

    }

}
