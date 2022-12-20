package newFile;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		try {
			File obj = new File("C:\\Users\\numan\\OneDrive\\Desktop\\Nazif\\txt");
			FileWriter fw = new FileWriter(obj);
			char c[] = { 'a', 'b', 'f' };
			fw.write(c);
			fw.close();
			System.out.println("File writing is sucessful");

		} catch (IOException d) {
			System.out.println("print: " + d);
		}

		try {
			File obj = new File("C:\\Users\\numan\\OneDrive\\Desktop\\Nazif\\txt");
			FileReader fir = new FileReader(obj);
			char data = (char) fir.read();
			System.out.println(data);
			fir.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
