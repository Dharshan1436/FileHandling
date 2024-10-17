package fileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		String path = "D://java//text.txt";
		File file=new File(path);
		file.delete();

	}

}
