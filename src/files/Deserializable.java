package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import pojo.Student;

public class Deserializable {

	public static void main(String[] args) {
	try {
		FileInputStream fileInputStream = new FileInputStream("G:\\Prog\\objectstate.txt");
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Student s = (Student)objectInputStream.readObject();
		s.setRoll(123);
		s.setFees(1254);
		System.out.println(s.getName()+" "+ s.getRoll()+" " + s.getFees());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
