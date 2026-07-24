package esercizio8_9_10;

public class Computer extends Dispositivo{

	public Computer() {
		super();
	}

	public Computer(String nome, double prezzo, SistemaOperativo sistemaoperativo) {
		super(nome, prezzo, sistemaoperativo);
	}
	

	public void inserisciPeriferica() {
		System.out.println("Stai inserendo la periferica");
	}
}
