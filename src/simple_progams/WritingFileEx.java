package simple_progams;

import java.io.*;
public class WritingFileEx{
    public static void main(String a[]){
    	String dir_path=("G:\\data\\");
    	
FileWriter file=null;

try{
	//File dir=new File(dir_path);
	File file2=new File(dir_path + "java.txt");
	Writer writer=new FileWriter(file2);

    
    writer.write("javadata");
    writer.write(65);//writes char corresponding to ascii code
    char[] ch= {'a','l','i','e'};
    writer.write(ch);
    writer.close();
}
catch(Exception e){
	//System.out.println("something went wrong");
}


}
    }
