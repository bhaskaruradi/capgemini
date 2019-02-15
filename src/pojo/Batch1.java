package pojo;

public class Batch1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("bhas");
		s1.setRoll(45);
		s1.setFees(1250);
		
		Student s2 = new Student();
		s2.setName("suresh");
		s2.setRoll(455);
		s2.setFees(125);
		
		Student s3 = new Student();
		s3.setName("bhsr");
		s3.setRoll(454);
		s3.setFees(12500);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		System.out.println(s1.getFees());
		
		System.out.println(s2.getName());
		System.out.println(s2.getRoll());
		System.out.println(s2.getFees());
		
		System.out.println(s3.getName());
		System.out.println(s3.getRoll());
		System.out.println(s3.getFees());
		
     }

}
