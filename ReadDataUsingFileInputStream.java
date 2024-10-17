package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataUsingFileInputStream {

    public static void main(String[] args) throws IOException {
        int i;
     
            FileInputStream fin = new FileInputStream("D:\\java\\data.txt");

            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            fin.close();
      
    }
}
