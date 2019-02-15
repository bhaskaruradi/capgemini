package Interfaces;



public class College1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College s1 = new College();
		s1.setName("bhas");
		s1.setRoll(45);
		s1.setFees(1250);
		s1.setClgname("CVSR");
		
		College s2= new College();
		s2.setName("bhas");
		s2.setRoll(45);
		s2.setFees(1250);
		s2.setClgname("vjit");
		
		College s3= new College();
		s3.setName("bhas");
		s3.setRoll(45);
		s3.setFees(1250);
		s3.setClgname("jbit");
		
		College s4= new College();
		s4.setName("bhas");
		s4.setRoll(45);
		s4.setFees(1250);
		s4.setClgname("kkr");
		
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		System.out.println(s1.getFees());
		System.out.println(s1.getClgname());
		System.out.println(s2.getClgname());
		System.out.println(s3.getClgname());
		System.out.println(s4.getClgname()); 
		
	}

}
