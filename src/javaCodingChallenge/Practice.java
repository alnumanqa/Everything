package javaCodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		String s = "java python c++ java python";
		s = "java python c++ java python";
		String a[] = s.split(" ");
		Set<String> b = new HashSet<>();
		// HashSet<String> b = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					b.add(a[i]);
				}
			}
		}
		System.out.println(b);

	}

}
