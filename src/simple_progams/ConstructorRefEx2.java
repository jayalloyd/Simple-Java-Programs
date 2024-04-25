package simple_progams;

import java.util.Arrays;
import java.util.List;

class Student{
	private String name;
	private int age;
	//default constructor
	public Student() {
		super();
	}
	//parameterized constructor
	public Student(String name) {
		super();
		this.name = name;
	}
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
public class ConstructorRefEx2 {

	public static void main(String a[])
	{
		List<String>names=Arrays.asList("meenu","lloyd","rooney");
		List<Student>students=names.stream()
								.map(String::toUpperCase)//to uppercase-> method reference
								.map(Student::new)
								.toList();
		System.out.println(students);
		
		
		
	}
}
