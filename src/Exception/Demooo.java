package Exception;

public class Demooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("bhaskar");
   
   try {
	   System.out.println(2/0);
   }catch(ArithmeticException e) {
	   System.out.println(e);
   }
   System.out.println("end");
	}

}
