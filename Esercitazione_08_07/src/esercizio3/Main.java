package esercizio3;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Crea una classe Java che stampi a schermo i numeri da 1 a 10. Utilizza sia un ciclo while, sia un ciclo for
		 */
		
		int i;
		
		System.out.println("Numeri da 1 a 10 con ciclo for:");
		for(i=1;i<=10;i++) 
			System.out.print(i + " ");
		
		i=1;
		System.out.println("\n\nNumeri da 1 a 10 con While:");
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
	}

}
