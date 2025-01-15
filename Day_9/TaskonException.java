
class Employee {

    String frirstName;
    String lastName;

    public Employee(String frirstName, String lastName) {
        super();
        this.frirstName = frirstName;
        this.lastName = lastName;
    }

    public void Validate() {
        if (frirstName == null || lastName == null) {
            throw new NullPointerException("First Name or Last Name cannot be null");
        } else {
            System.out.println("Employee details are valid.");
        }
    }

}

public class TaskonException {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Employee emp1 = new Employee(null, "harshu");
            emp1.Validate();

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

}
