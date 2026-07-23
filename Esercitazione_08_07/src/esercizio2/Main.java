package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creare una classe Java che controlli un carattere. Stampare a schermo se si tratta di una vocale o di una consonante
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un carattere: ");
		
		String carattere = input.nextLine().toLowerCase();
		
		input.close();
		switch(carattere) {
		case "a":
		case "e":
		case "i":
		case "o": 
		case "u":
			System.out.println("Il cartattere "+ carattere + " è una vocale");
			break;
		default:
			System.out.println("Il cartattere "+ carattere + " è una consonate");
		}
	}

}
