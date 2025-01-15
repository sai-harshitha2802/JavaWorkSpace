
public class MultipleCatchDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = new int[5];
        try {
            System.out.println(2 / 0);
        } catch (Exception e) {
            System.out.println("exception occured");
        }

    }

}
