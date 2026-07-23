package esercizio6;

public class SommaApprossimata {

	public static void main(String[] args) {
		double valore1;
		double valore2;
		int somma;
		
		valore1=54.8;
		valore2=37.4;
		
		somma=somma(valore1,valore2);
		System.out.println("Somma approssimata tra i due valori è: "+ somma+ "\n");
		
		valore1=845.53;
		valore2=534.65;
		somma=somma(valore1,valore2);
		System.out.println("Somma approssimata tra i due valori è: "+ somma+ "\n");
		
	}
	
	public static int  somma(double v1, double v2) {
		int temp;
		v1=v1+v2;
		temp=(int) v1;
		return temp;
	}

}
