package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataUsingFileInputStream {

	public static void main(String[] args) throws IOException {
		String data = "Hello fileHandling";

		FileOutputStream fout = new FileOutputStream("D:\\java\\data.txt");
		fout.write(data.getBytes());
		fout.close();
		System.out.println("success...");

	}
}
