package Interfaces;

public class Calculator implements Operations {
	
	
	public static void main(String[] args) {
		Calculator ca =new Calculator();
		ca.add();
		ca.sub();
	}

	@Override
	public void add() {
		System.out.println("add");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
		
	}
}
