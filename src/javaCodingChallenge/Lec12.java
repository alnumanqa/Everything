package javaCodingChallenge;

//this is the interview question, not the previous 2
// find the largest and the smallest number

public class Lec12 {

	public static void main(String[] args) {
		int[] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 1, 5, 5 };
		int largest = number[0];
		int smallest = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			} else if (number[i] < smallest) {
				smallest = number[i];
			}
		}
		System.out.println("Larger Number: " + largest + " and Smaller Number: " + smallest);
	}

  

	

}
