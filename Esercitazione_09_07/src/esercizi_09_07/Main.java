package esercizi_09_07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creare una classe Java che abbia all’interno un array di interi contenente i numeri da 0 a 9. Stampare l’array a schermo
		 */
		System.out.println("Creare una classe Java che abbia all’interno un array di interi contenente i numeri da 0 a 9. Stampare l’array a schermo\n");
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<array.length; i++)
		System.out.print(array[i] + " ");
		
		/*
		 * Creare una classe Java che abbia all’interno un array di interi contenente i numeri pari da 0 a 12. Stampare l’array a schermo.
		 */
		System.out.println("\n\nCreare una classe Java che abbia all’interno un array di interi contenente i numeri pari da 0 a 12. Stampare l’array a schermo\n");
		int[] array1 = new int[12];
		int temp=0;
		for(int j=0; j<=12; j++) {
			if(j%2==0) {
				array1[temp]=j;
				System.out.print(array1[temp] + " ");
				temp++;
			}
			
		}
		
		/*
		 * Creare una classe Java che abbia all’interno un array di interi contenente i numeri dispari da -3 a 11. Stampare l’array a schermo.
		 */
		System.out.println("\n\nCreare una classe Java che abbia all’interno un array di interi contenente i numeri dispari da -3 a 11. Stampare l’array a schermo.\n");
		int[] array2 = new int[10];
		temp=0;
		for(int j=-3; j<=11; j++) {
			if(j%2!=0) {
				array2[temp]=j;
				System.out.print(array2[temp] + " ");
				temp++;
			}
			
		}
		
		/*
		 * Creare una classe Java che abbia all’interno un array di stringhe scelte dal programmatore. Stampare l’array a schermo.
		 */
		System.out.println("\n\nCreare una classe Java che abbia all’interno un array di stringhe scelte dal programmatore. Stampare l’array a schermo.\n");
		System.out.print("Quante stringhe vuoi inserire? ");
		Scanner input= new Scanner(System.in);
		int valore = input.nextInt();
		input.nextLine();
		String[] array3 = new String[valore];
		
		for(int i=0; i<array3.length;i++) {
			System.out.println("Inserisci stringa: ");
			String testo = input.nextLine();
			array3[i]=testo;
		}
		
		for(int i=0; i<array3.length;i++) {
			System.out.print(array3[i] + " ");
		}
		
		
		/*
		 * Creare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dal programmatore. 
		 * Stampare la somma di tutti gli elementi dell’array a schermo.
		 */
		
		System.out.println("\n\nCreare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dal programmatore.\nStampare la somma di tutti gli elementi dell’array a schermo.\n");
		System.out.print("Quanti numeri vuoi inserire? ");
		valore = input.nextInt();
		input.nextLine();
		int[] array4 = new int[valore];
		
		for(int i=0; i<array4.length;i++) {
			System.out.print("Inserisci numero: ");
			int numero = input.nextInt();
			array4[i]=numero;
		}
		
		int somma=0;
		for(int i=0; i<array4.length;i++) {
			somma += array4[i];
		}
		System.out.println("La somma totale è: "+ somma);
		
		
		/*
		 * Creare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dalprogrammatore.
		 * Stampare la media di tutti gli elementi dell’array a schermo.
		 */
		System.out.println("\n\nCreare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dalprogrammatore.\nStampare la media di tutti gli elementi dell’array a schermo.\n");
		System.out.print("Quanti numeri vuoi inserire? ");
		valore = input.nextInt();
		input.nextLine();
		int[] array5 = new int[valore];
		
		for(int i=0; i<array5.length;i++) {
			System.out.print("Inserisci numero: ");
			int numero = input.nextInt();
			array5[i]=numero;
		}
		
		somma=0;
		for(int i=0; i<array5.length;i++) {
			somma += array5[i];
		}
		double media=((double)somma/array5.length);
		System.out.println("La media totale è: "+ media);
		
		/*
		 * Creare una classe Java che abbia all’interno un array di interi, con numeri arbitrari definiti dalprogrammatore.
		 * Con l’ausilio di una variabile, controllare che un numero sia nell’array.
		 */
		
		System.out.println("\n\nCreare una classe Java che abbia all’interno un array di interi, con numeri arbitrari definiti dalprogrammatore.\nCon l’ausilio di una variabile, controllare che un numero sia nell’array.");
		System.out.print("Quanti numeri vuoi inserire? ");
		valore = input.nextInt();
		input.nextLine();
		int[] array6 = new int[valore];
		
		for(int i=0; i<array6.length;i++) {
			System.out.print("Inserisci numero: ");
			int numero = input.nextInt();
			array6[i]=numero;
		}
		
		System.out.print("Di quale numero vuoi verificare la presenza nell'array? ");
		valore = input.nextInt();
		
		boolean flag=false;
		for(int i=0; i<array6.length;i++) {
			if(array6[i]==valore) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Il numero " + valore + " è presente nell'array");
		}else {
			System.out.println("Il numero " + valore + " non è presente nell'array");
		}
		
		/*
		 * Creare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dalprogrammatore.
		 * Stampare il massimo tra tutti gli elementi dell’array a schermo.
		 */
		
		System.out.print("\n\nCreare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dalprogrammatore.\nStampare il massimo tra tutti gli elementi dell’array a schermo.\n");
		System.out.print("Quanti numeri vuoi inserire? ");
		valore = input.nextInt();
		input.nextLine();
		int[] array7 = new int[valore];
		for(int i=0; i<array7.length;i++) {
			System.out.print("Inserisci numero: ");
			int numero = input.nextInt();
			array7[i]=numero;
		}
		temp=array7[0];
		for(int i=0; i<array7.length;i++) {
			if(temp<=array7[i]) {
				temp=array7[i];
			}
		}
		System.out.println("Il numero più grande presente all'interno dell'array è: "+ temp);
		
		input.close();
		
	}

}
