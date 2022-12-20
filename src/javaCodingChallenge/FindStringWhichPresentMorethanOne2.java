package javaCodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class FindStringWhichPresentMorethanOne2 {

	public static void main(String[] args) {
		String[] name = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };
		
		Set<String> a = new HashSet<>();
		
		for (int i = 0; i < name.length; i++) {
			for (int j = i +1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					a.add(name[i]);
				}
			}
		}
		System.out.println(a);
		
		
		

	}
}
