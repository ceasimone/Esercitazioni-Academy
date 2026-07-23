package esercizio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il valore: ");
		int variabile = input.nextInt();
		
		if(variabile>26) {
			System.out.println("il valore è maggiore di 26"); 
		}else if(variabile==26) {
			System.out.println("il valore è uguale a 26");
		}else{
			System.out.println("il valore è minore di 26");
		}

		input.close();
		
	}

}
