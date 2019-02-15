package Inheritance;

public class Grandson extends Child {
	public static void main(String args[]) {
		Grandson g = new Grandson();
		g.show();
		System.out.println("father name :"+" "+g.name);
		System.out.println("child name :"+" "+g.name);
	}

}
