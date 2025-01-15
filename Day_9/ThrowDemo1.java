import java.io.IOException;

class Voter {

    public void checkEligiblity(int age) {
        if (age >= 18) {
            System.out.println("eligible to vote");
        } else {
            throw new ArithmeticException("age is less ");
        }
    }

    public void checkAadharCard(boolean isAadharAvailable) throws IOException {
        if (isAadharAvailable) {
            System.out.println("you can vote");
        } else {
            throw new IOException("need aadhar card");
        }
    }
}

public class ThrowDemo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Voter vote = new Voter();
        try {
            vote.checkEligiblity(36);
            vote.checkAadharCard(true);
        } catch (ArithmeticException e) {
            System.out.println("exception occured");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }

    }

}
