package Interfaces;

public class Flyab extends Flyable {
	public static void main(String[] args) {
		Flyab f=new Flyab();
		f.firstAid();
		f.fly();
		f.start();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("areplone started");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("aero flying");
	}
}
