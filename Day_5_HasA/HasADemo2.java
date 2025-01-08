class Address1{
	int door;
	String Streetname;
	String Pincode;
	String City;
	public Address1(int door, String streetname, String pincode, String city) {
		super();
		this.door = door;
		this.Streetname = streetname;
		this.Pincode = pincode;
		this.City = city;
	}
	
	
}
class Employee1{
	int id;
	String name;
	int age;
	Address1 address;//entity reference- has a
	
		public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
		
		
//	public Employee1(int id, String name, int age, Address1 address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.address = address;
//	}
//	
	
	
	public void setId(int id) {
		this.id = id;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public void setAddress1(Address1 address) {
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


public class HasADemo2 {


	public static void main(String[] args) {
		
		Employee1 emp =new Employee1();
		emp.setId(12);
		emp.setAge(22);
		emp.setName("harshu");
		Address1 add =new Address1(1232,"omrsalai","5000031","chennai");
		emp.setAddress1(add);
		emp.display();
		
		
	}
}
