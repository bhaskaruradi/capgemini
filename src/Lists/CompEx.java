package Lists;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
      int rollno;
      String name;
      int age;
      Student(int rollno,String name,int age){
    	  this.rollno = rollno;
    	  this.name = name;
    	  this.age = age;
      }
	@Override
	public int compareTo(Student st) {
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
	
}

public class CompEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Student> al = new ArrayList<Student>();
    al.add(new Student(1,"bhas",25));
    al.add(new Student(2,"bhask",29));
    al.add(new Student(3,"bhaskar",21));
    
    Collections.sort(al);
    for (Student st : al) {
    	System.out.println(st.rollno+" "+st.name + " "+st.age);
		
	}
	}

}
