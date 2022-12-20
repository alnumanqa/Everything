package javaCodingChallenge;

//Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower
//you have to ask is it upper case or lower case?
//Better not to ask if they don't define

public class Lec6 {

	public static void main(String[] args) {
		String s = "ZiyadZ Alz KhilanliezZZZ";
		s = s.toLowerCase();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'z') {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
