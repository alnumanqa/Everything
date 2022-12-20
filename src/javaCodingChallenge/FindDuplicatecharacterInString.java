package javaCodingChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Question: Find duplicate character in a String
public class FindDuplicatecharacterInString {

	public static void main(String[] args) {
		String s = "a beautiful beach bob";
		
		s = s.replaceAll("\\s", "");
		System.out.println(s);
		//int count = 0;
		
		char a [] = s.toCharArray();
		//System.out.println(Arrays.toString(a));
		
		Set<Character> dublicateCharacter = new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i +1; j < a.length; j++) {
				if (a[i] == a[j]) {
					//count++;
					dublicateCharacter.add(a[i]);
				}
				
			}
			
		}
		//System.out.println(count);
		System.out.println(dublicateCharacter);
		
	

	}

}
