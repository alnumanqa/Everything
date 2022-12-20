package airport;

public class Lga { // Opening of the outer class body
	TerminalA ta = new TerminalA();
	TerminalB tb = new TerminalB();
	TerminalC tc = new TerminalC();

	
	

	public void wellcome() { // outer class method
		System.out.println("Wellcome to Lga airport");
	}

	public class TerminalA {// opening of the inner class body
		public void jetblue() { // inner class method
			System.out.println("Jetblue use terminal A");
		}

	} // Closing of the inner class body

	public class TerminalB {// opening of the inner class body
		public void american() {// inner class method
			System.out.println("American airlines use terminal B");
		}

	}// Closing of the inner class body

	public class TerminalC {// opening of the inner class body
		public void delta() {// inner class method
			System.out.println("Delta airlines use terminal C");
		}

	}// Closing of the inner class body

}// Closing of the outer class body
