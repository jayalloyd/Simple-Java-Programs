

package simple_progams;

import java.io.*;
public class PrintWriterExample{
    public static void main(String a[]){
    	String dir_path=("G:\\data\\");
    	
FileWriter file=null;
PrintWriter pwr=null;


try{
	//File dir=new File(dir_path);
	File file2=new File(dir_path + "java.txt");
	Writer writer=new FileWriter(file2);
	pwr=new PrintWriter(writer);
	pwr.println(65);
	pwr.println("java");
	pwr.println('A');
	pwr.println(true);
		
}
catch(Exception e){
	//System.out.println("something went wrong");
}
finally {
pwr.close();
}
    }}
