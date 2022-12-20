package javaCodingChallenge;

import java.util.HashSet;
import java.util.Set;
// Find duplicate character
public class Practice3 {

	public static void main(String[] args) {
		String a = "Md Abdullah Al Numan";
		a = a.replaceAll("\\s", "");
		char b [] = a.toCharArray();
		
		Set<Character> c = new HashSet<>();
		
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					c.add(b[i]);
				}
				
			}
		}
		System.out.println(c);

	}

}
