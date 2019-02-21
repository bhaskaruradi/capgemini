package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputEx2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	try {
		FileOutputStream fileOutputStream = new FileOutputStream("G:\\Prog\\demo1.txt");
		System.out.println("enter name");
		String n = sc.next();
		byte[] b =n.getBytes();
		fileOutputStream.write(b);
		fileOutputStream.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

	}


