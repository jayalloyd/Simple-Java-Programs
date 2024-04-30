package simple_progams;
import java.io.*;
class Students implements Serializable{
	private int id;
	private String name;
	private int age;
	public Students(int id, String name,int age) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	public void display() {
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("age"+age);

		
		
	}
}
public class SerializationExample {
public static void main(String a[]) {
	Students stud=new Students(1,"rooney",16);
	try {
	FileOutputStream fos=new FileOutputStream("G:\\data\\serial.txt");
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	System.out.println("please check the folder");
	oos.writeObject(stud);
	oos.close();
	fos.close();
	bos.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
		
	}
}
