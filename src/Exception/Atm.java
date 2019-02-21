package Exception;
 class  InvalidPinException extends Exception{
	public InvalidPinException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
 class Card{
	 int pin;
 }
public class Atm {
 public static boolean isValid(Card card) throws InvalidPinException{
	 if(card.pin==1000) {
		 return true;
	 }else throw new  InvalidPinException("pin not valid");
 }
}
