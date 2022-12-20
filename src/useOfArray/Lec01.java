package useOfArray;

import java.util.Arrays;

public class Lec01 {

	public static void main(String[] args) {
		int age[] = { 3, 6, 7, 2 };
		System.out.println(age.length);
		System.out.println(age[age.length - 1]);
		for (int i = 0; i < age.length; i++) {
			System.out.println(i);
		}
		for (int i:age) {
			System.out.println(i);
		}
		Arrays.sort(age);
		System.out.println(age.length);
		
		int a [][] = { { 1,2,3}, {4,5,6} };
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.toString(age));
		
		String b [] = {"Numan", "Niyaz", "Nazif"};
		System.out.println(b.length);
		System.out.println(Arrays.toString(b));
		String s = "I am Numan";
		char d [] = s.toCharArray();
		System.out.println(Arrays.toString(d));
		String e [] = s.split(" ");
		System.out.println(Arrays.toString(e));
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 5));
		System.out.println(s.indexOf('m'));
		System.out.println(s.indexOf('m',s.indexOf('m')+1));
		System.out.println(s.length()-1);
		for (String h:b) {
			System.out.println(h);
		}
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
		
		
		
		
		
		

	}

}
