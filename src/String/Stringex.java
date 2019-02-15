package String;

import java.util.Scanner;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
     String str = "Basaras";
     String str2 = new String("Bhaskar");
     System.out.println(str.charAt(1));
     //System.out.println(str.charAt(9));
       
     System.out.println(str.length());
     
     System.out.println(str.toLowerCase());
     
     System.out.println(str.toUpperCase());
     
     String str3 = "  hello  ";
     System.out.println(str3.trim());
     
     System.out.println(str.startsWith("Ba"));
     System.out.println(str2.endsWith("r"));
     
     int a= 10;
     String s = String.valueOf(a);
     System.out.println(s+20);
     
     String replaceS1 = str.replace(str3, str2);
     System.out.println(replaceS1);
     
    		
     
        
	}

}
