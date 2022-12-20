package read_and_write;

import java.io.File;
import java.io.IOException;

public class FolderAndFile {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\numan\\OneDrive\\Desktop\\Numan");
		folder.mkdir();

		if (folder.exists())
			;
		System.out.println(folder.getName() + " folder is created");
		// file is creating in Java folder

		File file = new File("C:\\Users\\numan\\OneDrive\\Desktop\\Java\\Numan");

		try {
			file.createNewFile();
		} catch (IOException f) {
			System.out.println("Print: " + f);

		}
		if (file.exists()) {
			System.out.println(file.getName() + " File is created");

		} else {
			System.out.println("File is not cteated");
		}
	}

}
