package esercizio6;
import java.util.Scanner;

public class Cerchio {
	static final double pi_greco=3.14;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il raggio della circonferenza: ");
		double raggio = input.nextDouble();
		
		areaCerchio(raggio);
		circonferenzaCerchio(raggio);
		input.close();
	}
	
	public static void areaCerchio(double r) {
		double temp;
		temp=pi_greco*(r*r);
		System.out.println("\nL'area del cerchio è: " + temp);
	}
	
	public static void circonferenzaCerchio(double r) {
		double temp;
		temp=(2*pi_greco)*r;
		System.out.println("\nLa circonferenza del cerchio è: " + temp);
	}
	
	
}
