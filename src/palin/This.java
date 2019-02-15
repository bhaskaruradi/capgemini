package palin;

 
 
public class This {
	int accNO;
	int balance;
	This() {
		System.out.println("Constructor called");
		
	}
	public This(int accNO, int balance) {
		// TODO Auto-generated constructor stub
		this();
		this.accNO= accNO;
		this.balance= balance;
		System.out.println(accNO +" "+balance);
		new This();  
		}
	
	public static void main(String[] args) {
		This t1=new This(25,100);
	}
}
