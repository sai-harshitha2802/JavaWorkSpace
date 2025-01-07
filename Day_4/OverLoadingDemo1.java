class Ecommerce{
    void filter(int model) {
    System.out.println("Filter by moldel number " + model);
    }
    void filter(String brandName) {
    System.out.println("filter by brand name "+brandName);
    }
    void filter(int model, String brandName) {
    System.out.println("filter by both brandName and model"+brandName+" "+ model );
    }
    }
     
    public class OverLoadingDemo1 {
     
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    Ecommerce emc= new Ecommerce();
    emc.filter(100105);
     
    }
     
    }
    