import java.util.Objects;


class Student{
	int id;
	String name;
	String course;
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && id == other.id && Objects.equals(name, other.name);
	}
	
	
}


public class HashCodeDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1 =new Student(15,"aishu","Core-Java");
		Student stud2 =new Student(12,"harshu","Core-Java");
		Student stud3 =new Student(15,"aishu","Core-Java");
		System.out.println(stud1.hashCode());
		System.out.println(stud2.hashCode());
		System.out.println(stud3.hashCode());
		
	}


}
