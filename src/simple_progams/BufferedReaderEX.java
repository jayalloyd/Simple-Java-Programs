package simple_progams;
import java.io.*;

public class BufferedReaderEX {
    public static void main(String a[]) {
        String file_path = "G:\\data\\java.txt";
        File file1 = new File(file_path);
        try {
            FileReader read = new FileReader(file1);
            BufferedReader br = new BufferedReader(read);
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
            br.close();
            read.close(); // Closing the FileReader
        } catch (Exception e) {
        	System.out.println("wrong");
        }
    }
}
