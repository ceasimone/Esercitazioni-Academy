package esercizio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il primo valore: ");
		double valore1= input.nextDouble();
		System.out.print("Inserisci il secondo valore: ");
		double valore2= input.nextDouble();
		
		boolean flag=true;
		input.nextLine();
		
		while(flag) {
		System.out.println("\n\nScrivere l'operazione desiderata:");
		System.out.println(" +");
		System.out.println(" -");
		System.out.println(" /");
		System.out.println(" *");
		System.out.println(" chiudi\n");
		
		String operazione = input.nextLine().toLowerCase();
		double temp;
		
		System.out.println("_______________________________________\n");
		switch(operazione) {
		case "+":
			temp=somma(valore1,valore2);
			System.out.println(valore1 + " + " + valore2 + " = " + temp);
			
			break;
		case "-":
			temp=sottrazione(valore1,valore2);
			System.out.println(valore1 + " - " + valore2 + " = " + temp);
			break;
		case "/":
			temp=divisione(valore1,valore2);
			System.out.println(valore1 + " / " + valore2 + " = " + temp);
			break;
		case "*":
			temp=moltiplicazione(valore1,valore2);
			System.out.println(valore1 + " * " + valore2 + " = " + temp);
			break;
		case "chiudi":
			System.out.println("Arrivederci");
			flag=false;
			break;
		default:
			System.out.println("Operazione non valida");
		}
		System.out.println("_______________________________________");
		}
		
		input.close();
		
	}
	
	public static double somma(double v1, double v2) {
		double temp1=0.0;
		temp1=v1+v2;
		return temp1;
	}
	
	public static double sottrazione(double v1, double v2) {
		double temp1=0.0;
		temp1=v1-v2;
		return temp1;
	}
	public static double divisione(double v1, double v2) {
		double temp1=0.0;
		temp1=v1/v2;
		return temp1;
	}
	public static double moltiplicazione(double v1, double v2) {
		double temp1=0.0;
		temp1=v1*v2;
		return temp1;
	}
	

}
