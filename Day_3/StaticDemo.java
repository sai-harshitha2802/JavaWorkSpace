package Day_3;

class Employee {

    int id;

    String Name;

    static String dept;//static variable

    static String CompanyName;

}

public class StaticDemo {

    public static void main(String args[]) {

        Employee.CompanyName = "Capgemini";//declaring using class name.

        Employee emp1 = new Employee();

        emp1.id = 1;

        emp1.Name = "harshu";

        emp1.dept = "hr";//declaring using object . This will override the value as we update.

        Employee emp2 = new Employee();

        emp2.id = 2;

        emp2.Name = "vasavi";

        emp2.dept = "manager";

        Employee emp3 = new Employee();

        emp3.id = 3;

        emp3.Name = "Anand";

        emp3.dept = "fresherpool";

        System.out.println(Employee.CompanyName);

        System.out.println(emp1.Name + " " + emp1.id + " " + emp1.dept);

        System.out.println(emp2.Name + " " + emp2.id + " " + emp2.dept);

        System.out.println(emp3.Name + " " + emp3.id + " " + emp3.dept);

    }

}
