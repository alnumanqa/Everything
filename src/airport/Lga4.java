package airport;

public class Lga4 { // Opening of the outer class body
	TerminalA ta = new TerminalA();
	TerminalB tb = new TerminalB();
	TerminalC tc = new TerminalC();
	TerminalD td = new TerminalD();

	public void wellcome() { // outer class method
		System.out.println("Wellcome to Lga airport");
		// Inner class method can them inside outer class method
		ta.jetblue();
		tb.american();
		tc.delta();
		td.usArilines();
		TerminalD.united();// static method
	}

	public class TerminalA {// opening of the inner class body
		public void jetblue() { // inner class method
			System.out.println("Jetblue use terminal A");
			wellcome();
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
	
	public static class TerminalD {// static class
		public void usArilines() { // non static method
			System.out.println("US airlines uss terminal D");
			
		}
		public static void united() {
			System.out.println("United airlines use terminal D");
		}
		
		
	}

}// Closing of the outer class body
