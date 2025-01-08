class Employee extends Object
{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}


public class ToStringDemo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		Employee emp =new Employee(1,"suresh" );
		System.out.println(a);
		System.out.println(emp);
		


	}


}
