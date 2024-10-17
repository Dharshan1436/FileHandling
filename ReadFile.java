package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "D://java//text.txt";
		File filePath = new File(path);
		Scanner sc = null;

		sc = new Scanner(filePath);
		while (sc.hasNext()) {
			String fileData = sc.nextLine();
			System.out.println(fileData);
		}

		sc.close();

	}

}
