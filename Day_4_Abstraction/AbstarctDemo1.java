abstract class Training{
    abstract void noOfStudents();
    abstract void faculty();
    void syllabus() {
     
    System.out.println("Java full stack devp");
    }
    }
    class Batch4 extends Training{
     
    @Override
    void noOfStudents() {
    // TODO Auto-generated method stub
    System.out.println("55");
    }
     
    @Override
    void faculty() {
    // TODO Auto-generated method stub
    System.out.println("safan");
    }
    }
    class Batch5 extends Training{
    @Override
    void noOfStudents() {
    // TODO Auto-generated method stub
    System.out.println("33");
    }
     
    @Override
    void faculty() {
    // TODO Auto-generated method stub
    System.out.println("vinay");
    }
    }
     
    public class AbstarctDemo1 {
    public static void main (String args[]) {
    Training b4=new Batch4();//replace Batch5()
    b4.noOfStudents();
    b4.faculty();
    // Training b5=new Batch5();
    // b5.noOfStudents();
    // b5.faculty();
    // 
    }
    }
     
    