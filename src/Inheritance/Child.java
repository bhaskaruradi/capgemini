package Inheritance;

public class Child  extends Parent {
	String name = "babi";
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println(name);
		System.out.println(super.name);
		show();
		super.show();
	}
	public void show() {
		System.out.println("child");
	}
	public static void main(String args[]) {
		Child c= new Child();
		
		//System.out.println("Father name"+" "+c.name);
	}

}
