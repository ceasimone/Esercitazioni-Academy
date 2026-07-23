package esercizio3;

import java.util.Scanner;

public class Main {
	private static int contatore;

	public static void main(String[] args) {
		int[] numeri= {1, 25, -4, 36, 0, -1, -4, 27, 3, -1,-1,52};
		
		Scanner input= new Scanner(System.in);
		System.out.println("Inserisci il valore da cercare: ");
		int valore = input.nextInt();
		boolean flag=false;
		for (int i=0; i<numeri.length; i++) {
			if(numeri[i] == valore) {
				flag=true;
				conta();
			}
		}
		
		if(flag) {
			System.out.println("Il valore "+ valore +" è presente " + contatore);
		}else {
			System.out.println("Il valore "+ valore +" non è presente");
		}
		
		input.close();
		
	}
	
	public static void conta() {
		contatore +=1;
	}

}
