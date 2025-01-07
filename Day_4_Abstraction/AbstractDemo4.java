abstract class Calculation{
    int num1;
    int num2;
    Calculation(int num1,int num2){
    this.num1=num1;
    this.num2=num2;
    }
    abstract int doOperation();
    }
    class Addition extends Calculation{
    Addition(int num1, int num2) {
    super(num1, num2);
    // TODO Auto-generated constructor stub
    }
     
    @Override
    int doOperation() {
    // TODO Auto-generated method stub
    return num1+num2;
    }
    }
    class Sub extends Calculation{
    Sub(int num1, int num2) {
    super(num1, num2);
    // TODO Auto-generated constructor stub
    }
     
    @Override
    int doOperation() {
    // TODO Auto-generated method stub
    return num1-num2;
    }
     
    }
    public class AbstractDemo4 {
     
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    Calculation cal =new Addition(2,5);
    System.out.println(cal.doOperation());
    }
     
    }
    