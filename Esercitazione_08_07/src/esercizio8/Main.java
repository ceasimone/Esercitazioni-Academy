package esercizio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creare una classe Java che stampi a schermola tabellina di un numero a piacere da 1 a 10
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero per avere la tabellina");
		int valore = input.nextInt();
		input.close();
		
		int temp;
		for(int i=1; i<=10;i++) {
			System.out.print(valore + " * " + i + " = ");
			temp=valore*i;
			System.out.println(temp);
		}
		
	}

}
