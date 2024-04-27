

package simple_progams;

import java.io.*;
public class BufferedWriterEx{
    public static void main(String a[]){
    	String dir_path=("G:\\data\\");
    	
FileWriter file=null;
BufferedWriter bwrir=null;

try{
	//File dir=new File(dir_path);
	File file2=new File(dir_path + "java.txt");
	Writer writer=new FileWriter(file2);
	 BufferedWriter bwriter=new BufferedWriter(writer);
	bwriter.write("alien");
	bwriter.write('c');
	char[] ch= {'j','a','v'};
	bwriter.write(ch);
	System.out.println("open your foler ");
    bwriter.close();
}
catch(Exception e){
	//System.out.println("something went wrong");
}


}
    }
