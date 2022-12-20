package javaCodingChallenge;

//Question: How many lower 'z'  inside the provided String?
//you have to ask is it upper case or lower case?
//Better not to ask if they don't define

public class Lec5 {

	public static void main(String[] args) {
		String s = "ZiyadZ Alz KhilanliezZZZ";
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'z') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
 