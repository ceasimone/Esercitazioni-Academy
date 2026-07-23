package esercizio5;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creare una classe Java che stampi a schermo i numeri pari da 0 a -10. Utilizza sia un while che un ciclo for
		 */
		
		int i;
		System.out.println("Numeri pari da 0 a -10 con ciclo for:");
		for(i=0;i>=-10;i--) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}
		
		i=0;
		System.out.println("\n\nNumeri pari da 0 a -10 con While:");
		while(i>=-10) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
			
			i--;
		}
		
	}

}
