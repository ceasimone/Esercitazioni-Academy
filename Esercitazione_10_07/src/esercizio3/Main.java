package esercizio3;

public class Main {

	public static void main(String[] args) {
		
		int i;
		
		System.out.println("Numeri da 14 a -3 con ciclo for:");
		for(i=14;i>=-3;i--) 
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		
		i=14;
		System.out.println("\n\nNumeri da 14 a -3 con While:");
		while(i>=-3) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
			i--;
		}


	}

}
