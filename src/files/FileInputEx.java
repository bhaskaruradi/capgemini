package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		FileInputStream fileInputStream = new FileInputStream("G:\\Prog\\demo.txt");
		System.out.println(fileInputStream.read());
		fileInputStream.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
