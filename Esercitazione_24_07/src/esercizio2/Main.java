package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		int valore=0;
		
		while(valore>=0) {
	
			System.out.println("Inserisci un valore positivo, se è negativo esci dall'inserimento");
			valore=input.nextInt();
			if(valore>=0) {
				lista.add(valore);
			}
		}
		
		System.out.println("Inserisci il valore da controllare per vedere i multipli e i non multipli: ");
		valore=input.nextInt();
		
		Lista.stampaMultipli(lista, valore);
		Lista.stampaNonMultipli(lista, valore);
		
		input.close();
	}

}
