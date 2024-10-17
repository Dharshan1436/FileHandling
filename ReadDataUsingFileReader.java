package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataUsingFileReader {

	public static void main(String[] args) throws IOException {
		int ch;

		FileReader fr = null;

		fr = new FileReader("D://java//text.txt");

		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);

		fr.close();

	}

}
