package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		String path="D://java//text.txt";
	File file	=new File(path);
	
		file.createNewFile();
	
	}

}
