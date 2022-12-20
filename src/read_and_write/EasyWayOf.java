package read_and_write;

import java.io.File;

public class EasyWayOf {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\numan\\OneDrive\\Desktop\\Java\\Numan");
		try {
			file.getParentFile().mkdir();
			file.createNewFile();
			
		}catch (Exception e) {
			System.out.println("print: " + e);
		}
		if(file.exists()) {
			System.out.println(file.getName());
		}

	}

}
