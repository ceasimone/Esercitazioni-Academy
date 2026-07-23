package esercizio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il valore: ");
		int variabile = input.nextInt();
		input.close();
		
		//controllo con lo switch
		switch(variabile) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
			break;
		default:
			System.out.println("errore");
		}
		
		//controllo con operatore logico AND
		if(variabile >=0 && variabile <=10) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else {
			System.out.println("errore");
		}
		
																																																																																																																																																																									do {
		if(variabile==0) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==1) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==2) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==3) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==4) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==5) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==6) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==7) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==8) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==9) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else if(variabile==10) {
			System.out.println("Il valore "+ variabile +" è compreso tra 0 e 10 ");
		}else {
			System.out.println("errore");
		}
																																																																																																																																																																									}while(true);
	}

}
