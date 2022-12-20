package newFile;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File na = new File("C:\\Users\\numan\\OneDrive\\Desktop\\Nazif");
		na.mkdir();
		
		if(na.exists()) {
			System.out.println(na.getName() + " Folder is created");
		}
		
		File file = new File("C:\\Users\\numan\\OneDrive\\Desktop\\Nazif\\txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
