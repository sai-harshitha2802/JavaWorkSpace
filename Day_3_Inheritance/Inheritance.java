// package Day_3_Inheritance;

class Parent {

    // void display() {
    // System.out.println("thsi is a parent class");
    // }
    Parent() {

        System.out.println("parent constructor");

    }

}

class Child extends Parent {

    // void display1() {
    // System.out.println("this is a child class");
    // } 
    Child() {

        System.out.println("child constructor");

    }

}

public class Inheritance {

    public static void main(String args[]) {

        Parent d1 = new Parent();

        Child d2 = new Child();

        // d1.display();
        // d2.display();
        // d2.display1();
    }

}
