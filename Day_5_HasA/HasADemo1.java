class Address{
	int door;
	String Streetname;
	String Pincode;
	String City;
	public Address(int door, String streetname, String pincode, String city) {
		super();
		this.door = door;
		this.Streetname = streetname;
		this.Pincode = pincode;
		this.City = city;
	}
	
	
}
class Employee{
	int id;
	String name;
	int age;
	Address address;//entity reference- has a
	public Employee(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void display() {
		System.out.println("id :"+id);
		System.out.println("name: "+name);
		System.out.println("age :"+ age);
		System.out.println("door no :"+ address.door);
		System.out.println("Street name :"+ address.Streetname);
		System.out.println("Pincode :"+ address.Pincode);
		System.out.println("City :"+ address.City);
	}
}


public class HasADemo1 {


	public static void main(String[] args) {
		
		Employee emp =new Employee(12,"harshu",22,new Address(1232,"omrsalai","5000031","chennai"));
		emp.display();
	}
}
