package esercizio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Quanti valori vuoi inserire?");
		int valore= input.nextInt();
		
		int[] array = new int[valore];
		boolean flag=false;
		for(int i=0; i<array.length;i++) {
			System.out.println("Inserisci il numero intero");
			valore= input.nextInt();
			array[i]=valore;
			
			if(valore<0) {
				flag=true;
			}
		}
		
		if(flag) {
			System.out.println("Nell'array ci sono dei valori negativi");
		}
		
		input.close();

	}

}
