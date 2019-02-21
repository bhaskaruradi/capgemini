package Exception;

public class Multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num1=10;
 int num2=5;
 int arr[] = {1,2,3,4};
 System.out.println("start");
 
 try {
	//System.out.println(num1/0);
	System.out.println(arr[6]);
} //catch (Exception e) {
	// TODO: handle exception
//}
 catch (ArithmeticException e) {
	System.out.println(e);
	// TODO: handle exception
}catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
	// TODO: handle exception
}
 finally {
	System.out.println("hi");
}
 try {
	System.out.println(num1/0);
} catch (ArithmeticException e) {
	// TODO: handle exception
	System.out.println(e);
}
 System.out.println("end");
	}

}
