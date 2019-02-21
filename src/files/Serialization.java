package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import pojo.Student;

public class Serialization {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("Bhaskar");
		//stu.setRoll(123);
		//stu.setFees(1245);
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("G:\\Prog\\objectstate.txt");
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(stu);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
