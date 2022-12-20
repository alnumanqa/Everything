package javaCodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class Practice4 {

	public static void main(String[] args) {
		int input[] = { 10, 28, 87, 10, 20, 76, 28, 80 };
		// output : 10,28
		
		Set<Integer> a = new HashSet<>();
		
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if (input[i] == input[j]) {
					a.add(input[i]);
				}
			}
		}
		System.out.println(a);
	}

}
