package javaCodingChallenge;



/*
Interview question in comcast (PA)F
Write a function to transform input, e.g.:
Input: "Hello Mohammad Tofael Kabir Sharkar"
Output: "Sharkar Kabir Tofael Mohammad Hello"
*/

public class Lec4 {

	public static void main(String[] args) {
		String s = "Md Abdullah Al Numan";
		String words[] = s.split(" ");
		//System.out.println(Arrays.toString(words)); 

		// char b [] = s.toCharArray();

		// System.out.println(Arrays.toString(b));
		// System.out.println(Arrays.toString(words));

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");

		}

	}

}
