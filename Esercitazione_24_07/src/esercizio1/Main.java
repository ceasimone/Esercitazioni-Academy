package esercizio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lista lista = new Lista();
		double valore ;
		boolean flag = true;
		while(flag) {
			try {
				System.out.println("Inserisci valore in double oppure scrivi 'esci' per terminare l'inserimento:");
				valore= input.nextDouble();
				lista.inserisci(valore);
			}catch(Exception e) {

			    String testo = input.next();

			    if (testo.equalsIgnoreCase("esci")) {
			        flag = false;
			    } else {
			        System.out.println("Valore non valido.");
			    }
			}
			
			
			
		}
		
		lista.stampaLista();

	}

}
