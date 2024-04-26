package simple_progams;
import java.io.*;
public class ReadingFromFileEx {
	public static void main(String a[]) {
   FileReader reader=null;
   File file1=new File("G:\\data\\java.txt");
   try {
    FileReader read=new FileReader(file1);
    reader=new FileReader(file1);
   int i=reader.read();
   while(i!=-1) {
	  
	   System.out.print((char)i);
	   i=reader.read();
   }
	reader.close();	
}
   catch(Exception e) {
	   System.out.println("wrong");
   }
}}