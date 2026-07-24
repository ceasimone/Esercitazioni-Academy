package esercizio8_9_10;

public class Smartphone extends Dispositivo{

	public Smartphone() {
		super();
	}

	public Smartphone(String nome, double prezzo, SistemaOperativo sistemaoperativo) {
		super(nome, prezzo, sistemaoperativo);
	}
	
	public void mandaMessaggio() {
		System.out.println("StO mandando un messaggio");
	}

}
