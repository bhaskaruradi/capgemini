package Excercise;

import java.util.Scanner;

public class Caesar {
private static StringBuilder encryption(String message,int key) {
	char[] letters = message.toCharArray();
	StringBuilder encryptedMsg = new StringBuilder();
	for (int i = 0; i < letters.length; i++) {
		encryptedMsg.append((char)(byte)(letters[i]+key));
	}
	System.out.println(encryptedMsg);
	return encryptedMsg;
}
private static void decryption(StringBuilder encryptedMsg,int key) {
	String msg = encryptedMsg.toString();
	char[] letters = msg.toCharArray();
	StringBuilder decryptedMsg = new StringBuilder();
	for (int i = 0; i < letters.length; i++) {
		decryptedMsg.append((char)(byte)(letters[i] - key));
	}
	System.out.println(decryptedMsg);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     decryption(encryption("Hello-world", 3),3);
	}

}
