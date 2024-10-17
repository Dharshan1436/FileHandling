package fileHandling;

import java.io.File;

public class DeleteFolder {

	public static void main(String[] args) {
		String path = "D://java";
		File file=new File(path);
		file.delete();

	}

}
