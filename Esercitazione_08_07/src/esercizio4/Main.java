package esercizio4;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creare una classe Java che stampi a schermo i numeri da 10 a 0. Utilizza sia un while che un ciclo for.
		 */

		int i;
		
		System.out.println("Numeri da 10 a 0 con ciclo for:");
		for(i=10;i>=0;i--) 
			System.out.print(i + " ");
		
		i=10;
		System.out.println("\n\nNumeri da 10 a 0 con While:");
		while(i>=0) {
			System.out.print(i + " ");
			i--;
		}
	}

}
