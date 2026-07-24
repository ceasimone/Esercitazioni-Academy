package esercizio2;

import java.util.ArrayList;
import java.util.List;

public abstract class Lista {
	private static List<Integer> nonmultipli = new ArrayList<>();
	private static List<Integer> multipli = new ArrayList<>();
	
	public static void stampaMultipli(List<Integer> lista,int n) {
		controlloMultipli(lista,n);
		System.out.print("Lista non multipli: ");
		multipli.forEach(i-> System.out.print(i + " "));
		System.out.println();
	}
	
	public static void stampaNonMultipli(List<Integer> lista, int n) {
		controlloNonMultipli(lista,n);
		System.out.print("Lista multipli: ");
		nonmultipli.forEach(i-> System.out.print(i + " "));
		System.out.println();
	}
	
	private static void controlloMultipli(List<Integer> lista,int n) {
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i)%n==0) {
				multipli.add(lista.get(i));
			}
		}
	}
	
	private static void controlloNonMultipli(List<Integer> lista,int n) {
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i)%n!=0) {
				nonmultipli.add(lista.get(i));
			}
		}
	}
	
	
}
