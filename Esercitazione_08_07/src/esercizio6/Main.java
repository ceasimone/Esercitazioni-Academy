package esercizio6;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Creare una classe Java che stampi a schermo i numeri dispari da -1 a 20. Utilizza sia un ciclo while, sia un ciclo for.
		 */
		
		int i;
		System.out.println("Numeri dispari da -1 a 20 con ciclo for:");
		for(i=-1;i<=20;i++) {
			
			if(i%2 == 1 || i%2 == -1) {
				System.out.print(i + " ");
			}
			
		}
		
		i=-1;
		System.out.println("\n\nNumeri dispari da -1 a 20 con While:");
		while(i<=20) {
			
			if(i%2 == 0) {
				
			}else {
				System.out.print(i + " ");
			}
			
			i++;
		}

	}

}
