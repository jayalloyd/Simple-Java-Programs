package simple_progams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
class Dog{
	private String dogName;
	private int dogAge;
	public Dog() {
		super();
	}
	public Dog(String dogName) {
		super();
		this.dogName = dogName;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + ", dogAge=" + dogAge + "]";
	}
	
	
}
public class ConstructorRefEx {
public static void main (String a[]) {
	List<String>names=Arrays.asList("meenu","rooney","rover");
	List<Dog>dogs=new ArrayList<>();
	             dogs=names.stream()
			         .map(Dog::new)//Constructor Reference ;it is a kind of method reference
			           .toList();
	System.out.println(dogs);
	
	  
		}
}
