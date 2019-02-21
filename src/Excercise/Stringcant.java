package Excercise;

import java.util.Scanner;

public class Stringcant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           String s1 = sc.next();
           String s2 = sc.next();
           canca(s1,s2);
	}
	private static void canca(String s1, String s2) {
		StringBuilder stb = new StringBuilder();
	          
			for (int i = 0; i < s1.length(); i++) {
				 stb.append(s1.charAt(i));
				 stb.append(s2.charAt(i));
				 stb.append(s2.charAt(i+1));
				 stb.append(s2.charAt(i+2));
			}
			System.out.println(stb);
	}
}
