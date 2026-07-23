package esercizio1;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro("1984", 18.90, "George Orwell");
		Libro l2 = new Libro("Duma Key", 24.50, "Stephen King");
		
		Serializzazione.serializza(l1);
		Deserializzazione.deserializza();
		System.out.println("");
		
		Serializzazione.serializza(l1,l2);
		Deserializzazione.deserializza();
		System.out.println("");
		
		Serializzazione.serializza(l2);
		Deserializzazione.deserializza();
		

	}

}
