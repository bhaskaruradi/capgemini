package Wrapper;

import java.util.Scanner;

import pojo.Student;

public class ObjectPasssing {
 Scanner sc = new Scanner(System.in);
 Student s = new Student();
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ObjectPasssing ob =new ObjectPasssing();
      //Student s1 = new Student();
       
      ob.display(ob.accept());
	}

	private void display(Student s) {
		// TODO Auto-generated method stub
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
	}

	public Student accept() {
		// TODO Auto-generated method stub
		System.out.println("enter name");
		s.setName(sc.next());
		
		System.out.println("enter rollnum");
		s.setRoll(sc.nextInt());
		
		System.out.println("enter fees");
		s.setFees(sc.nextDouble());
		return s;
	}

}
