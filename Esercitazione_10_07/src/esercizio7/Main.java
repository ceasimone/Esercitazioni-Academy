package esercizio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		double valore1 = input.nextDouble();
		System.out.println("Inserisci il secondo numero");
		double valore2 = input.nextDouble();
		
		if(valore1+valore2>100) {
			System.out.println("La somma dei due numeri è maggiore di 100");
		}else {
			System.out.println("La somma dei due numeri è minore di 100");
		}
		
		input.close();

	}

}
