class Engine{
    String type;


   public Engine(String type) {
       super();
       this.type = type;
   }
    
}
class Car{
   String model;
   String color;
   Engine engine;
   public void setModel(String model) {
       this.model = model;
   }
   public void setColor(String color) {
       this.color = color;
   }
   public void setEngine(Engine engine) {
       this.engine = engine;
   }
   void displaycar() {
       System.out.println(model);
       System.out.println(color);
       System.out.println(engine.type);
   }
   
}


public class HasADemo3 {
   public static void main(String[] args) {
       Car car =new Car();
       Engine e =new Engine("disel");
       car.setColor("red");
       car.setModel("hundai");
       car.setEngine(e);
       car.displaycar();
   }
}
