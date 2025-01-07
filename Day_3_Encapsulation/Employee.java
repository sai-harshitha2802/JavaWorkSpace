// package Day_3_Encapsulation;

public class Employee {

    public static void main(String args[]) {

        basic emp = new basic();

        // emp.id=10; //no direct access if they are mentioned as private.
        // emp.name="harshu";
        // System.out.println(emp.id);
        // System.out.println(emp.name);
        emp.setId(1);

        emp.setName("rishi");

        System.out.println(emp.getId());

        System.out.println(emp.getName());

    }

}
