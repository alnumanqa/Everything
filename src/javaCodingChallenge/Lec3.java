package javaCodingChallenge;
//Question: print your name horizontally but reverse

public class Lec3 {

	public static void main(String[] args) {
		String s = "Md Abdullah Al Numan";
		
		for (int i = s.length() -1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
