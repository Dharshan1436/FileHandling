package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataUsingBufferWriter {

	public static void main(String[] args) throws IOException {
	    FileWriter writer = new FileWriter("D:\\java\\data1.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to java.");  
	    buffer.close();  
	    System.out.println("Success");  

	}

}
