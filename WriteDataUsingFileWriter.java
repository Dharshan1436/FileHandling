package fileHandling;


import java.io.FileWriter;
import java.io.IOException;

public class WriteDataUsingFileWriter {

	public static void main(String[] args) throws IOException {
		String path="D://java//text.txt";
		FileWriter fileWriter = null;
	
		
			 fileWriter=new FileWriter(path);
			fileWriter.write("hello java");
		
		
				fileWriter.close();
			
		}

	}


