package Excercise;

import java.util.Scanner;

public class Conersion {

	
	
	static String timeConver(String s) {
		int hours = 0;
		String ans=null;
		
		String[] split = s.split(":");
		String s1 = null;
		if(split[2].endsWith("PM"))
		{
			if(split[0].equals("12"))
				hours=12;
			else
				hours = 12+Integer.parseInt(split[0]);
			ans = String.valueOf(hours) + ":" +split[1] + ":" + split[2].charAt(0)+split[2].charAt(1);
			
		}
		else {
			if(split[0].equals("12")) 
			s1="00";
			else
				s1=split[0];
			ans = s1 + ":" +split[1] + ":" + split[2].charAt(0)+split[2].charAt(1); 
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="07:50:05AM";
		String[] arr = s1.split(":");
		System.out.println(arr);
	}

}
