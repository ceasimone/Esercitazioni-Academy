package esercizio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Creare una classe Java che, a partire da 4 variabili che contengono la lunghezza dei lati di un quadrilatero,
		 *  stampi a schermo se la figura geometrica in questione è un quadrato, oppure no
		 */
		
		Scanner input= new Scanner(System.in);
		
		
		
		System.out.print("Inserisci il primo lato: ");
		int lato1 = input.nextInt();
		System.out.print("\nInserisci il secondo lato: ");
		int lato2 = input.nextInt();
		System.out.print("\nInserisci il terzo lato: ");
		int lato3 = input.nextInt();
		System.out.print("\nInserisci il quarto lato: ");
		int lato4 = input.nextInt();
		
		
		
		if(lato1==lato2 && lato3==lato4 && lato1==lato3) {
			System.out.print("La figura geometrica è un quadrato\n\n");
		}else {
			System.out.print("La figura geometrica non è un quadrato\n\n");
		}
		
		boolean flag=false;
		System.out.print("Inserisci lato: ");
		int lato11 = input.nextInt();
		System.out.print("\nInserisci lato: ");
		int lato12 = input.nextInt();
		if(lato11==lato12) {
			System.out.print("Inserisci lato: ");
			lato11 = input.nextInt();
			if(lato11==lato12) {
				System.out.print("Inserisci lato: ");
				lato12 = input.nextInt();
				if(lato11==lato12) {
					flag=true;
				}
			}
		}
		
		if(flag) {
			System.out.print("La figura geometrica è un quadrato");
		}else {
			System.out.print("La figura geometrica non è un quadrato");
		}
		
		input.close();
		
		
		
	}

}
