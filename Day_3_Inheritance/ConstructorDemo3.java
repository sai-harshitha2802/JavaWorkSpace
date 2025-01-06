// package Day_3_Inheritance;

class Person2 {

    int id;

    String Name;

    int age;

    public Person2(int id, String Name, int age) {

        super();

        this.id = id;

        this.age = age;

        this.Name = Name;

    }

}

class Employee2 extends Person2 {

    int salary;

    String dept;

    Employee2(int id, String Name, int age, String dept, int salary) {

        super(id, Name, age);

        this.dept = dept;

        this.salary = salary;

    }

    void displayEmployeeInfo() {

        System.out.println(id + " " + Name + " " + age + " " + dept + " " + salary);

    }

}

public class ConstructorDemo3 {

    public static void main(String[] args) {

// TODO Auto-generated method stub
        Employee2 emp = new Employee2(11, "harshu", 22, "cs", 42000);

        emp.displayEmployeeInfo();

    }

}
