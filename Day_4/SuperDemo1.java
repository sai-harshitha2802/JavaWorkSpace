class Parent{
    int a=1;//global declaration.
    }
    class Chlid extends Parent{
    int a=2;//global declaration
    void diaplay() {
    System.out.println("the value form the parent class"+" "+ super.a);
    System.out.println("the value form the global variable"+" "+ this.a);
    System.out.println("the value from child class"+" "+a);
    } 
    }
     
    public class SuperDemo1 {
     
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    Chlid cd=new Chlid();
    cd.diaplay();
    }
     
    }
    