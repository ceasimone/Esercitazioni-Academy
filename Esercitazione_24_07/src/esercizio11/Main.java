package esercizio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valore;
		
		System.out.println("Quanti valori vuoi inserire?");
		valore=input.nextInt();
		
		int[] array = new int[valore];
		
		for(int i=0; i<array.length;i++) {
			System.out.println("Inserisci valore");
			valore=input.nextInt();
			array[i]=valore;
		}
		
		System.out.println("Inserisci indice da scambiare");
		valore=input.nextInt();
		
		for(int n: array) {System.out.print(n);}
		
		System.out.println();
		
		spostamento(array,valore);
		
		for(int n: array) {System.out.print(n);}
		
		input.close();
		

	}
	
	public static void spostamento(int[] array,int index) {
		int indexMax= ricercaMassimo(array);
		int temp=array[index];
		if(index==indexMax) {
			System.out.println("Stai scambiando la posizione con se stesso");
		}else {
			array[index]=array[indexMax];
			array[indexMax]=temp;
		}
		
		
	}
	
	public static int ricercaMassimo(int[]array) {
		int max=array[0];
		int index=0;
		for(int i=1; i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
				index=i;
			}
		}
		return index;
	}
	
	

}
