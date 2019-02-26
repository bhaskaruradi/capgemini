package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class Anagram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		ArrayList<Character> al1 =new ArrayList<>();
		ArrayList<Character> al2 = new ArrayList<>();
		
		for (int i = 0; i < s1.length(); i++) {
			al1.add(new Character(s1.charAt(i)));
		}
		System.out.println(al1);
		
		for (int i = 0; i < s1.length(); i++) {
			al2.add(new Character(s2.charAt(i)));
		}
		System.out.println(al2);
		
		Collections.sort(al1);
		Collections.sort(al2);
		
		Iterator i1 =  al1.iterator();
		Iterator i2 = al2.iterator();
		
		if(al1.equals(al2))
		{
			System.out.println("anagrams");
		}
		else
			System.out.println("not anagrams");
       
	}
	

}
