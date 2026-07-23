package esercizio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il lato 1: ");
		int lato1 = input.nextInt();
		System.out.println("Inserisci il lato 2: ");
		int lato2 = input.nextInt();
		System.out.println("Inserisci il lato 3: ");
		int lato3 = input.nextInt();
		
		if(lato1==lato2 && lato2==lato3) {
			System.out.println("Il triangolo è equilatero");
		}else if(lato1==lato2 || lato1==lato3 || lato2==lato3) {
			System.out.println("Il triangolo è isoscele");
		}else {
			System.out.println("Il triangolo è scaleno");
		}
		input.close();
	}

}
