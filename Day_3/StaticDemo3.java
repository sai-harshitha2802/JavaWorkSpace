package Day_3;

public class StaticDemo3 {


    static {
    
    System.out.println("static block1");
    
    }
    
    public static void main (String args[]) {//JVM will call @runtime
    
    System.out.println("this is main method");
    
    }
    
    static {
    
    System.out.println("static block 2 ");
    
    }
    
    
    }