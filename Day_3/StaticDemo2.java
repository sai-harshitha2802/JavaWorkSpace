package Day_3;

class Student {

    static int batchcode;

    static void display() {

        System.out.println("this is a static method");

    }

    void display2() {

        System.out.println("this is a non static method");

    }

}

public class StaticDemo2 {

    public static void main(String args[]) {

        Student.batchcode = 1;//calling a static variable

        Student.display();//calling a static method

        Student std = new Student();//creating object to call the non static method

        std.display2();//calling a non static method

    }

}
