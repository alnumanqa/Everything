package javaCodingChallenge;

public class Lec9 {

	public static void main(String[] args) {
		String s = "Pack my box with five dozen liquor jugs";
		s = "Pack my box with five dozen liquor jugs";
		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && (s.charAt(i) != 'e') && (s.charAt(i) != 'i') && (s.charAt(i) != 'o')
					&& (s.charAt(i) != 'u')) {
				count++;

			}
		}
		System.out.println(count);

	}


	

}
