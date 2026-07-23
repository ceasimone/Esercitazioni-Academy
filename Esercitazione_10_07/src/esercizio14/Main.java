package esercizio14;

public class Main {
	
	//esercizio 15

	public static void main(String[] args) {
		ContoCorrente c1= new ContoCorrente("conto1", "Mario", 30000.00);
		ContoCorrente c2= new ContoCorrente("conto2", "Simone", 10.00);
		ContoCorrente c3= new ContoCorrente("conto3", "Onofrio", 1500.00);
		
		System.out.println("L'intestatario " + c1.intestatario + " deposita 1600.00 euro\n");
		c1.deposita(1600.00);
		System.out.println("L'intestatario " + c2.intestatario + " deposita 50.00 euro\n");
		c2.deposita(50.00);
		System.out.println("L'intestatario " + c3.intestatario + " deposita 800.00 euro\n");
		c3.deposita(800.00);
		
		System.out.println("L'intestatario " + c1.intestatario + " prova a prelevare 10000.00 euro, può farlo? " + c1.preleva(10000.00) + "\n");
		System.out.println("L'intestatario " + c2.intestatario + " prova a prelevare 500.00 euro, può farlo? " + c2.preleva(500.00) + "\n");
		System.out.println("L'intestatario " + c3.intestatario + " prova a prelevare 50.00 euro, può farlo? " + c3.preleva(50.00) + "\n");
		
		c1.stampaConto();
		c2.stampaConto();
		c3.stampaConto();
		
		
		
	}

}
