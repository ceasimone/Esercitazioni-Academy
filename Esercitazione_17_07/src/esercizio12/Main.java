package esercizio12;

public class Main {

	public static void main(String[] args) {
		Bicicletta a = new Bicicletta("Corsa",300.50);
		Bicicletta b = new Bicicletta("Strada",149.99);
		
		Bicicletta.compraBici(a, b);
		Bicicletta.compraBici(b, a);
		Bicicletta.compraBici(a, a);
	}

}
