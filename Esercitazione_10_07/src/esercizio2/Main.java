package esercizio2;

public class Main {

	public static void main(String[] args) {
		int i;
		
		System.out.println("Numeri pari da 1 a 14 con ciclo for:");
		for(i=1;i<=14;i++) 
			if(i%2==0) {
				System.out.print(i + " ");
			}
		
		i=1;
		System.out.println("\n\nNumeri pari da 1 a 14 con While:");
		while(i<=14) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
			i++;
		}

	}

}
