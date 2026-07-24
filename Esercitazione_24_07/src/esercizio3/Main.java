package esercizio3;

public class Main {
	public static void main(String[] args) {
		Squadra s1= new Squadra("Milan", 2500000000.00);
		
		Giocatore g1= new Giocatore("Pippo", "Franco", 360000.00);
		Giocatore g2= new Giocatore("Lupo", "Lucio", 250000.00);
		
		
		s1.vendiGiocatore(g1);
		s1.acquistaGiocatore(g1);
		System.out.println("Capitale: "+s1.getCapitale());
		s1.vendiGiocatore(g1);
		s1.vendiGiocatore(g2);
		
		System.out.println("Capitale: "+s1.getCapitale());
		s1.acquistaGiocatore(g2);
		System.out.println("Capitale: "+s1.getCapitale());
	}
}
