package simple_progams;
import java.io.*;
public class IOFileOperationsEx {
public static void main(String a[]) {
	
	try {
		String dir_path=("G:\\\\java");
	File file=new File(dir_path);
	System.out.println(file.list());
	String str[]=file.list();
	int counter=0;
	for (String name : str) {
		System.out.println(name);
		counter++;
	}
	System.out.println(counter);
	System.out.println(file.exists());
	System.out.println(file.createNewFile());
	}catch(Exception E) {
		System.out.println("Something is wrong");
	}

}
}
