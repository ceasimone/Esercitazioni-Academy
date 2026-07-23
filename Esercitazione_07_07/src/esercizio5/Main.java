package esercizio5;

public class Main {

	public static void main(String[] args) {
		double valore= 5.67;
		int temp = conversione(valore);
		System.out.println("Il valore "+ valore + " in double, diventa "+ temp + " come intero.");
	}
	
	public static int conversione(double numero) {
		int temp1=(int) numero;
		return temp1;
	}
}
