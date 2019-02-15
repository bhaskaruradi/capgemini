package Interfaces;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s= new Son();
		s.name();
				

	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("i am rama");
	}

}
