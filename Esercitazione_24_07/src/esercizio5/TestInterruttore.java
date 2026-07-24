package esercizio5;

import java.util.Scanner;

import esercizio4.Lampadina;

public class TestInterruttore {

	public static void main(String[] args) {
		Interruttore i1=new Interruttore();
		Interruttore i2=new Interruttore();
		
		Lampadina l1 = new Lampadina(5);
		
		i1.setLampadina(l1);
		i2.setLampadina(l1);

		Scanner input= new Scanner(System.in);
		
		int scelta;
		
		do {
			System.out.println("Inserisci valore di scelta:");
			System.out.println("1. Primo interruttore");
			System.out.println("2. Secondo interruttore");
			System.out.println("3. Stato lampadina");
			System.out.println("0. Esci");
			scelta = input.nextInt();
			switch(scelta) {
			case 1:
				i1.click();
				break;
			case 2:
				i2.click();
				break;
			case 3:
				l1.stato();
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
