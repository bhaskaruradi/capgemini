package Lists;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import pojo.Student;

public class Ex3 {
 static int count = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Student> sa = new ArrayList<Student>();
    sa.add(setInfo());
    sa.add(setInfo());
    
    try {
		FileOutputStream fileOutputStream = new FileOutputStream("G:\\Prog\\student.txt");
	ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
	
	objectOutputStream.writeObject(sa);
    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
	}
	private static Student setInfo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("enter the student details:" + count);
	    Student student = new Student();
	    student.setName(sc.next());
	    student.setRoll(sc.nextInt());
	    student.setFees(sc.nextDouble());
	    count++;
		return student;
	}

}
