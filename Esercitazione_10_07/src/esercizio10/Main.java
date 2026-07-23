package esercizio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo valore: ");
		int valore = input.nextInt();
		System.out.println("Inserisci il secondo valore: ");
		int valore1 = input.nextInt();
		
		if(valore>valore1) {
			System.out.println("Il valore " + valore + " è maggiore di " + valore1);
		}else if (valore==valore1) {
			System.out.println("I due valori sono uguali");
		}else {
			System.out.println("Il valore " + valore + " è minore di " + valore1);
		}
		
		input.close();
	}

}
