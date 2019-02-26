package Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Panagram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkString("the quick brown fox jumps over the lazy dog");
		
		
		
	}

	private static void checkString(String str1) {
		// TODO Auto-generated method stub
		HashSet<Character> hashSet = new HashSet<Character>();
		for (int i = 0; i < str1.length(); i++) {
			hashSet.add(str1.charAt(i));
		}
		if(hashSet.size()==27)
		{
			System.out.println("pangram");
		}
		else
			System.out.println("not pangram");
		}
	}


