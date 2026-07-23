package esercizio2;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		System.out.println("\nSomma:");
		System.out.println(CalcolatriceAvanzata.somma(2.0,4.0));
		System.out.println(CalcolatriceAvanzata.somma(2.0,4.0,5.0));
		System.out.println(CalcolatriceAvanzata.somma(2.0,4.0,5.0,6.0));
		
		System.out.println("\n\nSottrazione:");
		System.out.println(CalcolatriceAvanzata.sottrazione(2.0,4.0));
		System.out.println(CalcolatriceAvanzata.sottrazione(2.0,4.0,5.0));
		System.out.println(CalcolatriceAvanzata.sottrazione(2.0,4.0,5.0,6.0));
		System.out.println("\n\nDivisione:");
		System.out.println(CalcolatriceAvanzata.divisione(3.0,4.0));
		System.out.println(CalcolatriceAvanzata.divisione(3.0,4.0,5.0));
		System.out.println(CalcolatriceAvanzata.divisione(3.0,4.0,5.0,6.0));
		System.out.println("\n\nMoltiplicazione:");
		System.out.println(CalcolatriceAvanzata.moltiplicazione(5.0,4.0));
		System.out.println(CalcolatriceAvanzata.moltiplicazione(5.0,4.0,5.0));
		System.out.println(CalcolatriceAvanzata.moltiplicazione(5.0,4.0,5.0,6.0));
	}

}
