package esercizio6;

import java.util.Scanner;

public class TestLampadina {

	public static void main(String[] args) {
		Lampadina l1= new Lampadina(2);
		Scanner input= new Scanner(System.in);
		int scelta;
		
		do {
			System.out.println("Inserisci valore di scelta:");
			System.out.println("1. Stato");
			System.out.println("2. Click");
			System.out.println("3. stacco");
			System.out.println("4. attacco");
			System.out.println("0. Esci");
			scelta = input.nextInt();
			switch(scelta) {
			case 1:
				l1.stato();
				break;
			case 2:
				l1.click();
				break;
			case 3:
				Lampadina.setCorrente(false);
				break;
			case 4:
				Lampadina.setCorrente(true);
				break;
			case 0:
				scelta=0;
				break;
			default:
				System.out.println("Scelta non valida");
				break;
			}
		}while(scelta!=0);
		
		input.close();

	}

}
