package airport;

public class LgaTest {

	public static void main(String[] args) {
		System.out.println("\n-------Lga--------\n");
		Lga lga = new Lga();
		System.out.println("\n-------outer class method--------\n");
		lga.wellcome();
		System.out.println("\n-------inner class method--------\n");
		lga.ta.jetblue();
		lga.tb.american();
		lga.tc.delta();
		
		System.out.println("\n-------Lga2--------\n");
		Lga2 lga2 = new Lga2();
		lga2.wellcome();
		
		System.out.println("\n-------Lga3--------\n");
//		Lga3 lga3 = new Lga3();
//		lga3.wellcome();
		Lga3.TerminalD sc = new Lga3.TerminalD();
		sc.usArilines();
		Lga3.TerminalD.united();
		
		

	}

}
