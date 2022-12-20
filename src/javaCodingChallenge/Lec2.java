package javaCodingChallenge;

// Question: print your name vertically but reverse

public class Lec2 {
	
	public static void main(String[] args) {
		String s = "Md Abdullah Al Numan";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
			
		}
	}

}
