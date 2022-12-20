package javaCodingChallenge;


public class Lec13 {

	public static void main(String[] args) {
		int a [] = { 10, 12,1, 45,89,78};
		int largest = a[0];
		int smallest = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}else if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println("largest Number: " + largest + ", smallest Number: " + smallest);

	}

}
