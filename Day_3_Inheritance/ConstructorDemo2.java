// package Day_3_Inheritance;

class Person {

    Person(int id) {

        System.out.println("parent parameterised constructor " + id);

    }

    Person() {

        System.out.println("parent default constructor");

    }

}

class Employee extends Person {

    Employee() {

        super(123);

    }

}

public class ConstructorDemo2 {

    public static void main(String args[]) {

        Employee emp = new Employee();

    }

}
