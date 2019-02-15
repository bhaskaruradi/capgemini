package palin;

public class Bank {
	int accNo;
	int balance;
	Bank(){
		System.out.println("default constructor");
	
	}
	Bank(int i,int j){
		accNo=i;
		balance=j;
		System.out.println(accNo+" "+balance);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bank b1= new Bank();
			Bank b2 = new Bank(89,50);
	}

}
