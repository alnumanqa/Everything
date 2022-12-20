package read_and_write;

public class UseOfTryAndCatch {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;

		try {
			int divide = a / b;
			System.out.println("Outcome: " + divide);
		} catch (ArithmeticException d) {
			System.out.println("print: " + d);

		}

		int add = a + b;
		System.out.println("Print: " + add);

	}

}
