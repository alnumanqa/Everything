package stringManipulation;

import java.util.Arrays;

public class UseOfString {

	public static void main(String[] args) {
		String s = "Polymorphism is the ability of an object to take on many form. Encapsulation is data hiding. Abstraction is hiding the implemention deteils. Inheriatance is when a class inherit property from other class.";
		
		System.out.println(s.charAt(203));
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf('l', s.indexOf('l')+1));
		System.out.println(s.length());
		System.out.println(s.length()-1);
		
		s = "   Al   Numan";
		System.out.println(s.trim());
		System.out.println(s.trim().replace("   ", " "));
		System.out.println(s.substring(2));
		System.out.println(s.length());
		System.out.println(s.substring(4, 12));
		
		System.out.println("\nuse of array\n");
		int [] a = {1,2,3,4,5};
		System.out.println(a[3]);
		System.out.println(a.length);
		System.out.println(a.length - 1);
		System.out.println(a[a.length - 1]);
		
		String d = "My name is Numan";
		char [] cbc = d.toCharArray();
		System.out.println(Arrays.toString(cbc));
		
		String e = "My name is Numan";
		String [] word = e.split(" ");
		System.out.println(Arrays.toString(word));
	
	}

}
