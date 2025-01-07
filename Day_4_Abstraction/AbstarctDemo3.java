abstract class RBI{
    int intrest;
    String IFSCcode;
    RBI(int intrest, String IFSCcode){
    this.intrest=intrest;
    this.IFSCcode=IFSCcode; 
    }
    }
    class Axis extends RBI{
     
    Axis(int intrest, String IFSCcode) {
    super(intrest, IFSCcode);
    // TODO Auto-generated constructor stub
    }
    }
    public class AbstarctDemo3 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    RBI rbi=new Axis(45,"sbin000");
    }
     
    }
     
    