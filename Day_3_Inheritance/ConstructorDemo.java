// package Day_3_Inheritance;

class Car {

    Car(int id) {

        System.out.println("with parameter" + id);

    }

    Car() {

        System.out.println("without parameter");

    }

}

public class ConstructorDemo{

    public static void main(String args[]) {

        Car car = new Car(11);

        Car car1 = new Car();

    }

}
