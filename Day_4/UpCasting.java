class RBI {
    void rateofintrest() {
    System.out.println("ROI 4%");
    }
     
    void minimumbalance() {
    System.out.println("3k minimum balance");
    }
    }
    class Axis extends RBI{
    void womenloan() {
    System.out.println("given free loan");
    }
    void rateofintrest() {
    System.out.println("roi 7%");
    }
    }
    public class UpCasting {
     
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    RBI rbi = new Axis();
    rbi.rateofintrest();
    rbi.minimumbalance();
    }
     
    }
    