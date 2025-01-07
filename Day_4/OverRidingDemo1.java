class Parent3{
    void breakfast() {
    System.out.println("idly");
    }
    void marry() {
    System.out.println("suresh");
    }
    }
    class Child extends Parent3{
    void marry() {
    System.out.println("Mahesh");
    }
    }
    public class OverRidingDemo1 {
     
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    Child cd= new Child();
    cd.marry();
    cd.breakfast();
    // Parent3 p =new Parent3();
    // p.breakfast();
    // p.marry();
     
    }
     
    }
    